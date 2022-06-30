package vorobeij.yfinance.cache

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class CompositeCache(
    private val caches: Collection<NetworkCache>
) : NetworkCache {

    override fun getJsonString(key: String): String? {
        return caches
            .firstNotNullOfOrNull { it.getJsonString(key) }
            ?.let { Json.decodeFromString(it) }
    }

    override fun saveJsonString(key: String, json: String) {
        caches.forEach { it.saveJsonString(key, json) }
    }

}