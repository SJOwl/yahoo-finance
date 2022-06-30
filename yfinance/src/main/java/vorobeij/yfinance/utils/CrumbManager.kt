package vorobeij.yfinance.utils

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.*
import java.nio.charset.StandardCharsets
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by Stijn on 23/05/2017.
 */
object CrumbManager {
    private val HISTQUOTES2_SCRAPE_URL =
        System.getProperty("scrapeurl.histquotes2", "https://finance.yahoo.com/quote/%5EGSPC/options")
    private val HISTQUOTES2_CRUMB_URL =
        System.getProperty("crumburl.histquotes2", "https://query1.finance.yahoo.com/v1/test/getcrumb")
    private val HISTQUOTES2_CRUMB = System.getProperty("crumb", "")
    private val HISTQUOTES2_COOKIE = System.getProperty("cookie", "")
    private val HISTQUOTES2_COOKIE_NAMESPACE = System.getProperty("cookie.namespace", "yahoo")
    private val HISTQUOTES2_COOKIE_AGREE = System.getProperty("cookie.agree", "agree")
    private val HISTQUOTES2_COOKIE_OATH_URL = System.getProperty("cookie.oathurl", "https://guce.oath.com/consent")
    private val HISTQUOTES2_COOKIE_OATH_HOST = System.getProperty("cookie.oathhost", "guce.oath.com")
    private val HISTQUOTES2_COOKIE_OATH_ORIGIN = System.getProperty("cookie.oathorigin", "https://guce.oath.com")
    private val HISTQUOTES2_COOKIE_OATH_DONEURL =
        System.getProperty("cookie.oathDoneUrl", "https://guce.yahoo.com/copyConsent?sessionId=")
    private const val CONNECTION_TIMEOUT = 5000
    private var crumb: String? = null
    private var cookie: String? = null
    @Throws(IOException::class)
    private fun setCookie() {
        if (HISTQUOTES2_COOKIE != null && HISTQUOTES2_COOKIE.isNotEmpty()) {
            cookie = HISTQUOTES2_COOKIE
            return
        }
        val request = URL(HISTQUOTES2_SCRAPE_URL)
        val redirectableRequest = RedirectableRequest(request, 5)
        redirectableRequest.connectTimeout = CONNECTION_TIMEOUT
        redirectableRequest.readTimeout = CONNECTION_TIMEOUT
        val connection = redirectableRequest.openConnection()
        for (headerKey in connection.headerFields.keys) {
            if ("Set-Cookie".equals(headerKey, ignoreCase = true)) {
                for (cookieField in connection.headerFields[headerKey]!!) {
                    for (cookieValue in cookieField.split(";")) {
                        cookie = cookieField.split(";").first()
                        return
                    }
                }
            }
        }
        println("-- 0 $cookie")
        val datas: MutableMap<String, String> = HashMap()
        InputStreamReader(connection.getInputStream()).useLines {
            var prevTime = System.currentTimeMillis()
            for (line in it) {
                if (System.currentTimeMillis() - prevTime > 5000) break
                println(System.currentTimeMillis() - prevTime)

                prevTime = System.currentTimeMillis()

                //                println(line)
                val patternPostForm = Pattern.compile("(.*)(action=\"/consent\")(.*)")
                val patternInput = Pattern.compile("(.*)(<input type=\"hidden\" name=\")(.*?)(\" value=\")(.*?)(\">)")
                var matcher: Matcher
                var postFind = false
                // Read source to get params data for post request
                //                    System.out.println(line);
                matcher = patternPostForm.matcher(line)
                if (matcher.find()) {
                    postFind = true
                }
                if (postFind) {
                    matcher = patternInput.matcher(line)
                    if (matcher.find()) {
                        val name = matcher.group(3)
                        val value = matcher.group(5)
                        datas[name] = value
                    }
                }
            }
        }
        println("-- 1")

        // If params are not empty, send the post request
        if (datas.isNotEmpty()) {
            datas["namespace"] = HISTQUOTES2_COOKIE_NAMESPACE
            datas["agree"] = HISTQUOTES2_COOKIE_AGREE
            datas["originalDoneUrl"] = HISTQUOTES2_SCRAPE_URL
            datas["doneUrl"] =
                HISTQUOTES2_COOKIE_OATH_DONEURL + datas["sessionId"] + "&inline=" + datas["inline"] + "&lang=" + datas["locale"]
            val requestOath = URL(HISTQUOTES2_COOKIE_OATH_URL)
            val connectionOath: HttpURLConnection = requestOath.openConnection() as HttpURLConnection
            connectionOath.connectTimeout = CONNECTION_TIMEOUT
            connectionOath.readTimeout = CONNECTION_TIMEOUT
            connectionOath.requestMethod = "POST"
            connectionOath.doOutput = true
            connectionOath.setRequestProperty("Referer", connection.url.toString())
            connectionOath.setRequestProperty("Host", HISTQUOTES2_COOKIE_OATH_HOST)
            connectionOath.setRequestProperty("Origin", HISTQUOTES2_COOKIE_OATH_ORIGIN)
            connectionOath.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            val params = StringBuilder()
            for (key in datas.keys) {
                if (params.length == 0) {
                    params.append(key)
                    params.append("=")
                    params.append(URLEncoder.encode(datas[key], StandardCharsets.UTF_8))
                } else {
                    params.append("&")
                    params.append(key)
                    params.append("=")
                    params.append(URLEncoder.encode(datas[key], StandardCharsets.UTF_8))
                }
            }
            connectionOath.setRequestProperty("Content-Length", Integer.toString(params.toString().length))
            OutputStreamWriter(connectionOath.outputStream).use { outputStreamWriter ->
                outputStreamWriter.write(params.toString())
                outputStreamWriter.flush()
                connectionOath.instanceFollowRedirects = true
                connectionOath.responseCode
            }
        }
        println("-- 2")

        // Then Set the cookie with the cookieJar
        val cookieJar = (CookieHandler.getDefault() as CookieManager).cookieStore
        cookieJar.removeAll()
        val cookies = cookieJar.cookies
        for (hcookie in cookies) {
            if (hcookie.toString().matches(Regex("B=.*"))) {
                cookie = hcookie.toString()
                return
            }
        }
    }

    @Throws(IOException::class)
    private fun setCrumb() {
        if (HISTQUOTES2_CRUMB != null && HISTQUOTES2_CRUMB.isNotEmpty()) {
            crumb = HISTQUOTES2_CRUMB
            return
        }
        val crumbRequest = URL(HISTQUOTES2_CRUMB_URL)
        val redirectableCrumbRequest = RedirectableRequest(crumbRequest, 5)
        redirectableCrumbRequest.connectTimeout = CONNECTION_TIMEOUT
        redirectableCrumbRequest.readTimeout = CONNECTION_TIMEOUT
        val requestProperties: MutableMap<String, String?> = HashMap()
        requestProperties["Cookie"] = cookie
        val crumbConnection = redirectableCrumbRequest.openConnection(requestProperties)
        InputStreamReader(crumbConnection.getInputStream()).use { `is` ->
            BufferedReader(`is`).use { br ->
                val crumbResult = br.readLine()
                if (crumbResult != null && crumbResult.isNotEmpty()) {
                    crumb = crumbResult.trim { it <= ' ' }
                } else {
                }
            }
        }
    }

    @Throws(IOException::class)
    fun refresh() {
        println("refreshing crumbs...")
        cookie = null
        crumb = null
        if (cookie.isNullOrEmpty()) setCookie()
        if (crumb.isNullOrEmpty()) setCrumb()
        println("refresh crumbs done cookie = $cookie, crumb = $crumb")
    }

    @Synchronized
    @Throws(IOException::class)
    fun getCrumb(): String {
        if (crumb.isNullOrEmpty()) {
            refresh()
        }
        return crumb!!
    }

    @Throws(IOException::class)
    fun getCookie(): String {
        if (cookie.isNullOrEmpty()) {
            refresh()
        }
        return cookie!!
    }
}