package vorobeij.yfinance.cache

class CompositeCache(
    private val caches: Collection<NetworkCache>
) : NetworkCache {

    override fun getJsonString(key: String): String? {
        return caches
            .firstNotNullOfOrNull { it.getJsonString(key) }
    }

    override fun saveJsonString(key: String, json: String) {
        caches.forEach { it.saveJsonString(key, json) }
    }

}