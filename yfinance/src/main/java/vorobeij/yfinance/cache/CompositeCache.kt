package vorobeij.yfinance.cache

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class CompositeCache(
    private val cacheFirst: NetworkCache,
    private val cacheSecond: NetworkCache?
) : NetworkCache {

    override fun getJsonString(key: String): String? {
        return cacheFirst.getJsonString(key)
            ?.let { Json.decodeFromString(it) }
            ?: cacheSecond?.getJsonString(key)
    }

    override fun saveJsonString(key: String, json: String) {
        cacheSecond?.saveJsonString(key, json)
        cacheFirst.saveJsonString(key, json)
    }

}