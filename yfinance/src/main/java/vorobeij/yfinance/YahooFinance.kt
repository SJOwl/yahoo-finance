package vorobeij.yfinance

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import vorobeij.yfinance.data.QuoteSummary
import vorobeij.yfinance.data.QuoteSummaryResponse

object YahooFinance {

}

private val retrofit = Retrofit.Builder()

interface YahooApi {

    @GET("https://query2.finance.yahoo.com/v10/finance/quoteSummary/{ticker}?modules=incomeStatementHistoryQuarterly")
    suspend fun quoteSummaryQuarterly(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse
}

class YahooRepository(
    private val api: YahooApi
) {
    suspend fun quoteSummary(ticker: String): QuoteSummary {
        return api.quoteSummaryQuarterly(ticker).quoteSummary
    }
}