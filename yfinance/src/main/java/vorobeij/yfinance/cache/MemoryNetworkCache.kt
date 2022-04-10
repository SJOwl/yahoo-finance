package vorobeij.yfinance.cache

class MemoryNetworkCache : NetworkCache {

    private val store = hashMapOf<String, String>()

    override fun getJsonString(key: String): String? = store[key]

    override fun saveJsonString(key: String, json: String) {
        store[key] = json
    }
}