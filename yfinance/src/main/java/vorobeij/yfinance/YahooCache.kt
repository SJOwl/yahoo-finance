package vorobeij.yfinance

import java.io.File

class YahooCache {

    private val root = "./cache"

    init {
        File(root).mkdirs()
    }

    fun get(key: String): String? {
        val f = file(key)
        return if (f.exists()) f.readText() else null
    }

    fun save(key: String, json: String) {
        file(key).writeText(json)
    }

    private fun file(key: String): File {
        return File(root, key)
    }
}