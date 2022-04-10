package vorobeij.yfinance.cache

import java.io.File

class NetworkFileCache : NetworkCache {

    private val root = "./cache"

    init {
        File(root).mkdirs()
    }

    override fun getJsonString(key: String): String? {
        val f = file(key)
        return if (f.exists()) f.readText() else null
    }

    override fun saveJsonString(key: String, json: String) {
        file(key).writeText(json)
    }

    private fun file(key: String): File {
        return File(root, key)
    }
}
