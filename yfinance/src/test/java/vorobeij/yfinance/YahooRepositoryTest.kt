package vorobeij.yfinance

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.create

class YahooRepositoryTest {

    @ExperimentalSerializationApi companion object {

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://query2.finance.yahoo.com/v10/finance/")
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BASIC
                    })
                    .build()
            ).build()
        private val api = retrofit.create<YahooApi>()
        private val yahooRepository = YahooRepository(api)
    }

    @Test fun `api test`() {

        runBlocking {
            println(yahooRepository.quoteSummary("AAPL"))
        }
    }
}