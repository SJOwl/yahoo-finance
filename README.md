# Yahoo Finance kotlin api

```kotlin
// Use in-memory cache
YahooFinance(cache = MemoryNetworkCache())
// Use file cache
val yf = YahooFinance()

println(yf.earningsTrend("AAPL", refresh = true))
```

# Gradle

Publishing to maven is not done yet. Build library locally and import from `mavenLocal()`