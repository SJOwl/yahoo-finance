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
        return getData("$ticker-quoteSummary", refresh) {
            api.quoteSummary(ticker).quoteSummaryObj.result[0]
        }
    }

    suspend fun assetProfile(ticker: String, refresh: Boolean = false): AssetProfile {
        return getData("$ticker-AssetProfile", refresh) {
            api.assetProfile(ticker).quoteSummaryObj.result[0].assetProfile as AssetProfile
        }
    }

    suspend fun balanceSheetHistory(ticker: String, refresh: Boolean = false): BalanceSheetHistory {
        return getData("$ticker-BalanceSheetHistory", refresh) {
            api.balanceSheetHistory(ticker).quoteSummaryObj.result[0].balanceSheetHistory as BalanceSheetHistory
        }
    }

    suspend fun balanceSheetHistoryQuarterly(ticker: String, refresh: Boolean = false): BalanceSheetHistory {
        return getData("$ticker-BalanceSheetHistoryQuarterly", refresh) {
            api.balanceSheetHistoryQuarterly(ticker).quoteSummaryObj.result[0].balanceSheetHistoryQuarterly!!
        }
    }

    suspend fun calendarEvents(ticker: String, refresh: Boolean = false): CalendarEvents {
        return getData("$ticker-CalendarEvents", refresh) {
            api.calendarEvents(ticker).quoteSummaryObj.result[0].calendarEvents!!
        }
    }

    suspend fun cashflowStatementHistory(ticker: String, refresh: Boolean = false): CashflowStatementHistory {
        return getData("$ticker-CashflowStatementHistory", refresh) {
            api.cashflowStatementHistory(ticker).quoteSummaryObj.result[0].cashflowStatementHistory!!
        }
    }

    suspend fun cashflowStatementHistoryQuarterly(ticker: String, refresh: Boolean = false): CashflowStatementHistory {
        return getData("$ticker-CashflowStatementHistoryQuarterly", refresh) {
            api.cashflowStatementHistoryQuarterly(ticker).quoteSummaryObj.result[0].cashflowStatementHistoryQuarterly!!
        }
    }

    suspend fun defaultKeyStatistics(ticker: String, refresh: Boolean = false): DefaultKeyStatistics {
        return getData("$ticker-DefaultKeyStatistics", refresh) {
            api.defaultKeyStatistics(ticker).quoteSummaryObj.result[0].defaultKeyStatistics!!
        }
    }

    suspend fun earnings(ticker: String, refresh: Boolean = false): EarningsOverview {
        return getData("$ticker-Earnings", refresh) {
            api.earnings(ticker).quoteSummaryObj.result[0].earnings!!
        }
    }

    suspend fun earningsHistory(ticker: String, refresh: Boolean = false): EarningsHistory {
        return getData("$ticker-EarningsHistory", refresh) {
            api.earningsHistory(ticker).quoteSummaryObj.result[0].earningsHistory!!
        }
    }

    suspend fun earningsTrend(ticker: String, refresh: Boolean = false): EarningsTrend {
        return getData("$ticker-EarningsTrend", refresh) {
            api.earningsTrend(ticker).quoteSummaryObj.result[0].earningsTrend!!
        }
    }

    suspend fun financialData(ticker: String, refresh: Boolean = false): FinancialData {
        return getData("$ticker-FinancialData", refresh) {
            api.financialData(ticker).quoteSummaryObj.result[0].financialData!!
        }
    }

    suspend fun fundOwnership(ticker: String, refresh: Boolean = false): FundOwnership {
        return getData("$ticker-FundOwnership", refresh) {
            api.fundOwnership(ticker).quoteSummaryObj.result[0].fundOwnership!!
        }
    }

    suspend fun incomeStatementHistory(ticker: String, refresh: Boolean = false): IncomeStatementHistory {
        return getData("$ticker-IncomeStatementHistory", refresh) {
            api.incomeStatementHistory(ticker).quoteSummaryObj.result[0].incomeStatementHistory!!
        }
    }

    suspend fun incomeStatementHistoryQuarterly(ticker: String, refresh: Boolean = false): IncomeStatementHistory {
        return getData("$ticker-IncomeStatementHistoryQuarterly", refresh) {
            api.incomeStatementHistoryQuarterly(ticker).quoteSummaryObj.result[0].incomeStatementHistoryQuarterly!!
        }
    }

    suspend fun indexTrend(ticker: String, refresh: Boolean = false): IndexTrend {
        return getData("$ticker-IndexTrend", refresh) {
            api.indexTrend(ticker).quoteSummaryObj.result[0].indexTrend!!
        }
    }

    suspend fun industryTrend(ticker: String, refresh: Boolean = false): IndexTrend {
        return getData("$ticker-IndustryTrend", refresh) {
            api.industryTrend(ticker).quoteSummaryObj.result[0].industryTrend!!
        }
    }

    suspend fun insiderHolders(ticker: String, refresh: Boolean = false): InsiderHolders {
        return getData("$ticker-InsiderHolders", refresh) {
            api.insiderHolders(ticker).quoteSummaryObj.result[0].insiderHolders!!
        }
    }

    suspend fun insiderTransactions(ticker: String, refresh: Boolean = false): InsiderTransactions {
        return getData("$ticker-InsiderTransactions", refresh) {
            api.insiderTransactions(ticker).quoteSummaryObj.result[0].insiderTransactions!!
        }
    }

    suspend fun institutionOwnership(ticker: String, refresh: Boolean = false): InstitutionOwnership {
        return getData("$ticker-InstitutionOwnership", refresh) {
            api.institutionOwnership(ticker).quoteSummaryObj.result[0].institutionOwnership!!
        }
    }

    suspend fun majorDirectHolders(ticker: String, refresh: Boolean = false): MajorDirectHolders {
        return getData("$ticker-MajorDirectHolders", refresh) {
            api.majorDirectHolders(ticker).quoteSummaryObj.result[0].majorDirectHolders!!
        }
    }

    suspend fun majorHoldersBreakdown(ticker: String, refresh: Boolean = false): MajorHoldersBreakdown {
        return getData("$ticker-MajorHoldersBreakdown", refresh) {
            api.majorHoldersBreakdown(ticker).quoteSummaryObj.result[0].majorHoldersBreakdown!!
        }
    }

    suspend fun netSharePurchaseActivity(ticker: String, refresh: Boolean = false): NetSharePurchaseActivity {
        return getData("$ticker-NetSharePurchaseActivity", refresh) {
            api.netSharePurchaseActivity(ticker).quoteSummaryObj.result[0].netSharePurchaseActivity!!
        }
    }

    suspend fun price(ticker: String, refresh: Boolean = false): Price {
        return getData("$ticker-Price", refresh) {
            api.price(ticker).quoteSummaryObj.result[0].price!!
        }
    }

    suspend fun quoteType(ticker: String, refresh: Boolean = false): QuoteType {
        return getData("$ticker-QuoteType", refresh) { api.quoteType(ticker).quoteSummaryObj.result[0].quoteType!! }
    }

    suspend fun recommendationTrend(ticker: String, refresh: Boolean = false): RecommendationTrend {
        return getData("$ticker-RecommendationTrend", refresh) {
            api.recommendationTrend(ticker).quoteSummaryObj.result[0].recommendationTrend!!
        }
    }

    suspend fun secFilings(ticker: String, refresh: Boolean = false): SecFilings {
        return getData("$ticker-SecFilings", refresh) {
            api.secFilings(ticker).quoteSummaryObj.result[0].secFilings!!
        }
    }

    suspend fun sectorTrend(ticker: String, refresh: Boolean = false): IndexTrend {
        return getData("$ticker-SectorTrend", refresh) {
            api.sectorTrend(ticker).quoteSummaryObj.result[0].sectorTrend!!
        }
    }

    suspend fun summaryDetail(ticker: String, refresh: Boolean = false): SummaryDetail {
        return getData("$ticker-SummaryDetail", refresh) {
            api.summaryDetail(ticker).quoteSummaryObj.result[0].summaryDetail!!
        }
    }

    suspend fun summaryProfile(ticker: String, refresh: Boolean = false): SummaryProfile {
        return getData("$ticker-SummaryProfile", refresh) {
            api.summaryProfile(ticker).quoteSummaryObj.result[0].summaryProfile!!
        }
    }

    suspend fun upgradeDowngradeHistory(ticker: String, refresh: Boolean = false): UpgradeDowngradeHistory {
        return getData("$ticker-UpgradeDowngradeHistory", refresh) {
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