package vorobeij.yfinance.cache

interface NetworkCache {
    fun getJsonString(key: String): String?
    fun saveJsonString(key: String, json: String)
}

interface ObjectCache {
    fun getObject(key: String): Any?
    fun saveObject(key: String, obj: Any)
}
