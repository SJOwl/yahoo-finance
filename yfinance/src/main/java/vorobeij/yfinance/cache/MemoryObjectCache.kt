package vorobeij.yfinance.cache

class MemoryObjectCache(
    private val maxSize: Int = 500
) : ObjectCache {

    private val cache = hashMapOf<String, Any>()

    override fun getObject(key: String): Any? {
        return cache[key]
    }

    override fun saveObject(key: String, obj: Any) {
        if (cache.size > maxSize) {
            cache.clear()
        }
        cache[key] = obj
    }
}