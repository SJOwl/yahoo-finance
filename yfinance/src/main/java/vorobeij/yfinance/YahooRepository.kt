package vorobeij.yfinance

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import vorobeij.yfinance.data.AssetProfile
import vorobeij.yfinance.data.BalanceSheetHistory
import vorobeij.yfinance.data.CalendarEvents
import vorobeij.yfinance.data.CashflowStatementHistory
import vorobeij.yfinance.data.DefaultKeyStatistics
import vorobeij.yfinance.data.EarningsHistory
import vorobeij.yfinance.data.EarningsOverview
import vorobeij.yfinance.data.EarningsTrend
import vorobeij.yfinance.data.FinancialData
import vorobeij.yfinance.data.FundOwnership
import vorobeij.yfinance.data.IncomeStatementHistory
import vorobeij.yfinance.data.IndexTrend
import vorobeij.yfinance.data.InsiderHolders
import vorobeij.yfinance.data.InsiderTransactions
import vorobeij.yfinance.data.InstitutionOwnership
import vorobeij.yfinance.data.MajorDirectHolders
import vorobeij.yfinance.data.MajorHoldersBreakdown
import vorobeij.yfinance.data.NetSharePurchaseActivity
import vorobeij.yfinance.data.Price
import vorobeij.yfinance.data.QuoteType
import vorobeij.yfinance.data.RecommendationTrend
import vorobeij.yfinance.data.SecFilings
import vorobeij.yfinance.data.Summary
import vorobeij.yfinance.data.SummaryDetail
import vorobeij.yfinance.data.SummaryProfile
import vorobeij.yfinance.data.UpgradeDowngradeHistory

class YahooRepository(
    private val api: YahooApi
) {

    private val cache = YahooCache()

    suspend fun quoteSummary(ticker: String, refresh: Boolean = true): Summary {
        return getData("quoteSummary-$ticker", refresh) {
            api.quoteSummary(ticker).quoteSummaryObj.result[0]
        }
    }

    suspend fun assetProfile(ticker: String, refresh: Boolean = false): AssetProfile {
        return getData("AssetProfile-$ticker", refresh) {
            api.assetProfile(ticker).quoteSummaryObj.result[0].assetProfile as AssetProfile
        }
    }

    suspend fun balanceSheetHistory(ticker: String, refresh: Boolean = false): BalanceSheetHistory {
        return getData("BalanceSheetHistory-$ticker", refresh) {
            api.balanceSheetHistory(ticker).quoteSummaryObj.result[0].balanceSheetHistory as BalanceSheetHistory
        }
    }

    suspend fun balanceSheetHistoryQuarterly(ticker: String, refresh: Boolean = false): BalanceSheetHistory {
        return getData("BalanceSheetHistoryQuarterly-$ticker", refresh) {
            api.balanceSheetHistoryQuarterly(ticker).quoteSummaryObj.result[0].balanceSheetHistoryQuarterly!!
        }
    }

    suspend fun calendarEvents(ticker: String, refresh: Boolean = false): CalendarEvents {
        return getData("CalendarEvents-$ticker", refresh) {
            api.calendarEvents(ticker).quoteSummaryObj.result[0].calendarEvents!!
        }
    }

    suspend fun cashflowStatementHistory(ticker: String, refresh: Boolean = false): CashflowStatementHistory {
        return getData("CashflowStatementHistory-$ticker", refresh) {
            api.cashflowStatementHistory(ticker).quoteSummaryObj.result[0].cashflowStatementHistory!!
        }
    }

    suspend fun cashflowStatementHistoryQuarterly(ticker: String, refresh: Boolean = false): CashflowStatementHistory {
        return getData("CashflowStatementHistoryQuarterly-$ticker", refresh) {
            api.cashflowStatementHistoryQuarterly(ticker).quoteSummaryObj.result[0].cashflowStatementHistoryQuarterly!!
        }
    }

    suspend fun defaultKeyStatistics(ticker: String, refresh: Boolean = false): DefaultKeyStatistics {
        return getData("DefaultKeyStatistics-$ticker", refresh) {
            api.defaultKeyStatistics(ticker).quoteSummaryObj.result[0].defaultKeyStatistics!!
        }
    }

    suspend fun earnings(ticker: String, refresh: Boolean = false): EarningsOverview {
        return getData("Earnings-$ticker", refresh) {
            api.earnings(ticker).quoteSummaryObj.result[0].earnings!!
        }
    }

    suspend fun earningsHistory(ticker: String, refresh: Boolean = false): EarningsHistory {
        return getData(
            "EarningsHistory-$ticker", refresh
        ) { api.earningsHistory(ticker).quoteSummaryObj.result[0].earningsHistory!! }
    }

    suspend fun earningsTrend(ticker: String, refresh: Boolean = false): EarningsTrend {
        return getData(
            "EarningsTrend-$ticker", refresh
        ) { api.earningsTrend(ticker).quoteSummaryObj.result[0].earningsTrend!! }
    }

    suspend fun financialData(ticker: String, refresh: Boolean = false): FinancialData {
        return getData(
            "FinancialData-$ticker", refresh
        ) { api.financialData(ticker).quoteSummaryObj.result[0].financialData!! }
    }

    suspend fun fundOwnership(ticker: String, refresh: Boolean = false): FundOwnership {
        return getData(
            "FundOwnership-$ticker", refresh
        ) { api.fundOwnership(ticker).quoteSummaryObj.result[0].fundOwnership!! }
    }

    suspend fun incomeStatementHistory(ticker: String, refresh: Boolean = false): IncomeStatementHistory {
        return getData("IncomeStatementHistory-$ticker", refresh) {
            api.incomeStatementHistory(ticker).quoteSummaryObj.result[0].incomeStatementHistory!!
        }
    }

    suspend fun incomeStatementHistoryQuarterly(ticker: String, refresh: Boolean = false): IncomeStatementHistory {
        return getData("IncomeStatementHistoryQuarterly-$ticker", refresh) {
            api.incomeStatementHistoryQuarterly(ticker).quoteSummaryObj.result[0].incomeStatementHistoryQuarterly!!
        }
    }

    suspend fun indexTrend(ticker: String, refresh: Boolean = false): IndexTrend {
        return getData("IndexTrend-$ticker", refresh) {
            api.indexTrend(ticker).quoteSummaryObj.result[0].indexTrend!!
        }
    }

    suspend fun industryTrend(ticker: String, refresh: Boolean = false): IndexTrend {
        return getData("IndustryTrend-$ticker", refresh) {
            api.industryTrend(ticker).quoteSummaryObj.result[0].industryTrend!!
        }
    }

    suspend fun insiderHolders(ticker: String, refresh: Boolean = false): InsiderHolders {
        return getData("InsiderHolders-$ticker", refresh) {
            api.insiderHolders(ticker).quoteSummaryObj.result[0].insiderHolders!!
        }
    }

    suspend fun insiderTransactions(ticker: String, refresh: Boolean = false): InsiderTransactions {
        return getData("InsiderTransactions-$ticker", refresh) {
            api.insiderTransactions(ticker).quoteSummaryObj.result[0].insiderTransactions!!
        }
    }

    suspend fun institutionOwnership(ticker: String, refresh: Boolean = false): InstitutionOwnership {
        return getData("InstitutionOwnership-$ticker", refresh) {
            api.institutionOwnership(ticker).quoteSummaryObj.result[0].institutionOwnership!!
        }
    }

    suspend fun majorDirectHolders(ticker: String, refresh: Boolean = false): MajorDirectHolders {
        return getData("MajorDirectHolders-$ticker", refresh) {
            api.majorDirectHolders(ticker).quoteSummaryObj.result[0].majorDirectHolders!!
        }
    }

    suspend fun majorHoldersBreakdown(ticker: String, refresh: Boolean = false): MajorHoldersBreakdown {
        return getData("MajorHoldersBreakdown-$ticker", refresh) {
            api.majorHoldersBreakdown(ticker).quoteSummaryObj.result[0].majorHoldersBreakdown!!
        }
    }

    suspend fun netSharePurchaseActivity(ticker: String, refresh: Boolean = false): NetSharePurchaseActivity {
        return getData("NetSharePurchaseActivity-$ticker", refresh) {
            api.netSharePurchaseActivity(ticker).quoteSummaryObj.result[0].netSharePurchaseActivity!!
        }
    }

    suspend fun price(ticker: String, refresh: Boolean = false): Price {
        return getData("Price-$ticker", refresh) {
            api.price(ticker).quoteSummaryObj.result[0].price!!
        }
    }

    suspend fun quoteType(ticker: String, refresh: Boolean = false): QuoteType {
        return getData("QuoteType-$ticker", refresh) { api.quoteType(ticker).quoteSummaryObj.result[0].quoteType!! }
    }

    suspend fun recommendationTrend(ticker: String, refresh: Boolean = false): RecommendationTrend {
        return getData("RecommendationTrend-$ticker", refresh) {
            api.recommendationTrend(ticker).quoteSummaryObj.result[0].recommendationTrend!!
        }
    }

    suspend fun secFilings(ticker: String, refresh: Boolean = false): SecFilings {
        return getData("SecFilings-$ticker", refresh) {
            api.secFilings(ticker).quoteSummaryObj.result[0].secFilings!!
        }
    }

    suspend fun sectorTrend(ticker: String, refresh: Boolean = false): IndexTrend {
        return getData("SectorTrend-$ticker", refresh) {
            api.sectorTrend(ticker).quoteSummaryObj.result[0].sectorTrend!!
        }
    }

    suspend fun summaryDetail(ticker: String, refresh: Boolean = false): SummaryDetail {
        return getData("SummaryDetail-$ticker", refresh) {
            api.summaryDetail(ticker).quoteSummaryObj.result[0].summaryDetail!!
        }
    }

    suspend fun summaryProfile(ticker: String, refresh: Boolean = false): SummaryProfile {
        return getData("SummaryProfile-$ticker", refresh) {
            api.summaryProfile(ticker).quoteSummaryObj.result[0].summaryProfile!!
        }
    }

    suspend fun upgradeDowngradeHistory(ticker: String, refresh: Boolean = false): UpgradeDowngradeHistory {
        return getData("UpgradeDowngradeHistory-$ticker", refresh) {
            api.upgradeDowngradeHistory(ticker).quoteSummaryObj.result[0].upgradeDowngradeHistory!!
        }
    }

    private inline fun <reified T> getData(key: String, refresh: Boolean, fetch: () -> T): T {
        return if (refresh) {
            fetch.invoke().also {
                cache.save(key, Json.encodeToString(it))
            }
        } else {
            cache.get(key)
                ?.let { Json.decodeFromString(it) }
                ?: fetch.invoke().also {
                    cache.save(key, Json.encodeToString(it))
                }
        }
    }
}