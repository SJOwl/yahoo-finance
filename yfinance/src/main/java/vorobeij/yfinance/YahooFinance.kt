package vorobeij.yfinance

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.create
import vorobeij.yfinance.cache.CompositeCache
import vorobeij.yfinance.cache.FileNetworkCache
import vorobeij.yfinance.cache.MemoryNetworkCache
import vorobeij.yfinance.cache.NetworkCache

private const val BASE_URL = "https://query2.finance.yahoo.com/v10/finance/"
private val json = Json {
    ignoreUnknownKeys = true
}
private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
    .client(
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.NONE
            })
            .build()
    )
    .build()

private val api = retrofit.create<YahooApi>()

class YahooFinance(
    cache: NetworkCache = CompositeCache(listOf(MemoryNetworkCache(), FileNetworkCache()))
) : YahooFinanceApi by YahooRepository(api, cache)
