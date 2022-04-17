package vorobeij.yfinance

enum class QueryInterval(val tag: String) {
    DAILY("1d"), WEEKLY("5d"), MONTHLY("1mo");
}