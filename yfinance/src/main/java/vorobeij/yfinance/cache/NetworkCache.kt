package vorobeij.yfinance.cache

interface NetworkCache {
    fun getJsonString(key: String): String?
    fun saveJsonString(key: String, json: String)
}