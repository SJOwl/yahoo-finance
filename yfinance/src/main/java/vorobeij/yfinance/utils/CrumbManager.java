package vorobeij.yfinance.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stijn on 23/05/2017.
 */
public class CrumbManager {

    public static final String HISTQUOTES2_SCRAPE_URL = System.getProperty("scrapeurl.histquotes2", "https://finance.yahoo.com/quote/%5EGSPC/options");
    public static final String HISTQUOTES2_CRUMB_URL = System.getProperty("crumburl.histquotes2", "https://query1.finance.yahoo.com/v1/test/getcrumb");
    public static final String HISTQUOTES2_CRUMB = System.getProperty("crumb", "");
    public static final String HISTQUOTES2_COOKIE = System.getProperty("cookie", "");
    public static final String HISTQUOTES2_COOKIE_NAMESPACE = System.getProperty("cookie.namespace", "yahoo");
    public static final String HISTQUOTES2_COOKIE_AGREE = System.getProperty("cookie.agree", "agree");
    public static final String HISTQUOTES2_COOKIE_OATH_URL = System.getProperty("cookie.oathurl", "https://guce.oath.com/consent");
    public static final String HISTQUOTES2_COOKIE_OATH_HOST = System.getProperty("cookie.oathhost", "guce.oath.com");
    public static final String HISTQUOTES2_COOKIE_OATH_ORIGIN = System.getProperty("cookie.oathorigin", "https://guce.oath.com");
    public static final String HISTQUOTES2_COOKIE_OATH_DONEURL = System.getProperty("cookie.oathDoneUrl", "https://guce.yahoo.com/copyConsent?sessionId=");

    public static final int CONNECTION_TIMEOUT = Integer.parseInt(System.getProperty("connection.timeout", "10000"));


    private static String crumb = "";
    private static String cookie = "";

    private static void setCookie() throws IOException {
        if (HISTQUOTES2_COOKIE != null && !HISTQUOTES2_COOKIE.isEmpty()) {
            cookie = HISTQUOTES2_COOKIE;
            return;
        }

        URL request = new URL(HISTQUOTES2_SCRAPE_URL);
        RedirectableRequest redirectableRequest = new RedirectableRequest(request, 5);
        redirectableRequest.setConnectTimeout(CONNECTION_TIMEOUT);
        redirectableRequest.setReadTimeout(CONNECTION_TIMEOUT);


        URLConnection connection = redirectableRequest.openConnection();

        for (String headerKey : connection.getHeaderFields().keySet()) {
            if ("Set-Cookie".equalsIgnoreCase(headerKey)) {
                for (String cookieField : connection.getHeaderFields().get(headerKey)) {
                    for (String cookieValue : cookieField.split(";")) {
                        if (cookieValue.matches("B=.*")) {
                            cookie = cookieValue;
                            return;
                        }
                    }
                }
            }
        }

        Map<String, String> datas = new HashMap<>();
        //  If cookie is not set, we should consent to activate cookie
        try (InputStreamReader is = new InputStreamReader(connection.getInputStream()); BufferedReader br = new BufferedReader(is)) {
            String line;
            Pattern patternPostForm = Pattern.compile("(.*)(action=\"/consent\")(.*)");
            Pattern patternInput = Pattern.compile("(.*)(<input type=\"hidden\" name=\")(.*?)(\" value=\")(.*?)(\">)");
            Matcher matcher;
            boolean postFind = false;
            // Read source to get params data for post request
            while ((line = br.readLine()) != null) {
                matcher = patternPostForm.matcher(line);
                if (matcher.find()) {
                    postFind = true;
                }

                if (postFind) {
                    matcher = patternInput.matcher(line);
                    if (matcher.find()) {
                        String name = matcher.group(3);
                        String value = matcher.group(5);
                        datas.put(name, value);
                    }
                }

            }
        }
        // If params are not empty, send the post request
        if (datas.size() > 0) {

            datas.put("namespace", HISTQUOTES2_COOKIE_NAMESPACE);
            datas.put("agree", HISTQUOTES2_COOKIE_AGREE);
            datas.put("originalDoneUrl", HISTQUOTES2_SCRAPE_URL);
            datas.put("doneUrl", HISTQUOTES2_COOKIE_OATH_DONEURL + datas.get("sessionId") + "&inline=" + datas.get("inline") + "&lang=" + datas.get("locale"));

            URL requestOath = new URL(HISTQUOTES2_COOKIE_OATH_URL);
            HttpURLConnection connectionOath;
            connectionOath = (HttpURLConnection) requestOath.openConnection();
            connectionOath.setConnectTimeout(CONNECTION_TIMEOUT);
            connectionOath.setReadTimeout(CONNECTION_TIMEOUT);
            connectionOath.setRequestMethod("POST");
            connectionOath.setDoOutput(true);
            connectionOath.setRequestProperty("Referer", connection.getURL().toString());
            connectionOath.setRequestProperty("Host", HISTQUOTES2_COOKIE_OATH_HOST);
            connectionOath.setRequestProperty("Origin", HISTQUOTES2_COOKIE_OATH_ORIGIN);
            connectionOath.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            StringBuilder params = new StringBuilder();

            for (String key : datas.keySet()) {
                if (params.length() == 0) {
                    params.append(key);
                    params.append("=");
                    params.append(URLEncoder.encode(datas.get(key), StandardCharsets.UTF_8));
                } else {
                    params.append("&");
                    params.append(key);
                    params.append("=");
                    params.append(URLEncoder.encode(datas.get(key), StandardCharsets.UTF_8));

                }
            }


            connectionOath.setRequestProperty("Content-Length", Integer.toString(params.toString().length()));
            try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connectionOath.getOutputStream())) {
                outputStreamWriter.write(params.toString());
                outputStreamWriter.flush();
                connectionOath.setInstanceFollowRedirects(true);
                connectionOath.getResponseCode();
            }
        }

        // Then Set the cookie with the cookieJar
        CookieStore cookieJar = ((CookieManager) CookieHandler.getDefault()).getCookieStore();
        cookieJar.removeAll();
        List<HttpCookie> cookies = cookieJar.getCookies();
        for (HttpCookie hcookie : cookies) {
            if (hcookie.toString().matches("B=.*")) {
                cookie = hcookie.toString();

                return;
            }
        }


    }

    private static void setCrumb() throws IOException {
        if (HISTQUOTES2_CRUMB != null && !HISTQUOTES2_CRUMB.isEmpty()) {
            crumb = HISTQUOTES2_CRUMB;

            return;
        }

        URL crumbRequest = new URL(HISTQUOTES2_CRUMB_URL);
        RedirectableRequest redirectableCrumbRequest = new RedirectableRequest(crumbRequest, 5);
        redirectableCrumbRequest.setConnectTimeout(CONNECTION_TIMEOUT);
        redirectableCrumbRequest.setReadTimeout(CONNECTION_TIMEOUT);

        Map<String, String> requestProperties = new HashMap<>();
        requestProperties.put("Cookie", cookie);

        URLConnection crumbConnection = redirectableCrumbRequest.openConnection(requestProperties);
        try (InputStreamReader is = new InputStreamReader(crumbConnection.getInputStream()); BufferedReader br = new BufferedReader(is)) {
            String crumbResult = br.readLine();

            if (crumbResult != null && !crumbResult.isEmpty()) {
                crumb = crumbResult.trim();
            } else {
            }
        }
    }

    public static void refresh() throws IOException {
        setCookie();
        setCrumb();
    }

    public static synchronized String getCrumb() throws IOException {
        if (crumb == null || crumb.isEmpty()) {
            refresh();
        }
        return crumb;
    }

    public static String getCookie() throws IOException {
        if (cookie == null || cookie.isEmpty()) {
            refresh();
        }
        return cookie;
    }

}
