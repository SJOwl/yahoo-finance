package vorobeij.yfinance

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import vorobeij.yfinance.cache.NetworkCache
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
import vorobeij.yfinance.data.UpgradeDowngradeHistory

internal class YahooRepository(
    private val api: YahooApi,
    private val cache: NetworkCache
) : YahooFinanceApi {

    override suspend fun quoteSummary(ticker: String, refresh: Boolean): Summary {
        return getData("$ticker-quoteSummary", refresh) {
            api.quoteSummary(ticker).quoteSummaryObj.result[0]
        }
    }

    override suspend fun assetProfile(ticker: String, refresh: Boolean): AssetProfile {
        return getData("$ticker-AssetProfile", refresh) {
            api.assetProfile(ticker).quoteSummaryObj.result[0].assetProfile as AssetProfile
        }
    }

    override suspend fun balanceSheetHistory(ticker: String, refresh: Boolean): BalanceSheetHistory {
        return getData("$ticker-BalanceSheetHistory", refresh) {
            api.balanceSheetHistory(ticker).quoteSummaryObj.result[0].balanceSheetHistory as BalanceSheetHistory
        }
    }

    override suspend fun balanceSheetHistoryQuarterly(ticker: String, refresh: Boolean): BalanceSheetHistory {
        return getData("$ticker-BalanceSheetHistoryQuarterly", refresh) {
            api.balanceSheetHistoryQuarterly(ticker).quoteSummaryObj.result[0].balanceSheetHistoryQuarterly!!
        }
    }

    override suspend fun calendarEvents(ticker: String, refresh: Boolean): CalendarEvents {
        return getData("$ticker-CalendarEvents", refresh) {
            api.calendarEvents(ticker).quoteSummaryObj.result[0].calendarEvents!!
        }
    }

    override suspend fun cashflowStatementHistory(ticker: String, refresh: Boolean): CashflowStatementHistory {
        return getData("$ticker-CashflowStatementHistory", refresh) {
            api.cashflowStatementHistory(ticker).quoteSummaryObj.result[0].cashflowStatementHistory!!
        }
    }

    override suspend fun cashflowStatementHistoryQuarterly(ticker: String, refresh: Boolean): CashflowStatementHistory {
        return getData("$ticker-CashflowStatementHistoryQuarterly", refresh) {
            api.cashflowStatementHistoryQuarterly(ticker).quoteSummaryObj.result[0].cashflowStatementHistoryQuarterly!!
        }
    }

    override suspend fun defaultKeyStatistics(ticker: String, refresh: Boolean): DefaultKeyStatistics {
        return getData("$ticker-DefaultKeyStatistics", refresh) {
            api.defaultKeyStatistics(ticker).quoteSummaryObj.result[0].defaultKeyStatistics!!
        }
    }

    override suspend fun earnings(ticker: String, refresh: Boolean): EarningsOverview {
        return getData("$ticker-Earnings", refresh) {
            api.earnings(ticker).quoteSummaryObj.result[0].earnings!!
        }
    }

    override suspend fun earningsHistory(ticker: String, refresh: Boolean): EarningsHistory {
        return getData("$ticker-EarningsHistory", refresh) {
            api.earningsHistory(ticker).quoteSummaryObj.result[0].earningsHistory!!
        }
    }

    override suspend fun earningsTrend(ticker: String, refresh: Boolean): EarningsTrend {
        return getData("$ticker-EarningsTrend", refresh) {
            api.earningsTrend(ticker).quoteSummaryObj.result[0].earningsTrend!!
        }
    }

    override suspend fun financialData(ticker: String, refresh: Boolean): FinancialData {
        return getData("$ticker-FinancialData", refresh) {
            api.financialData(ticker).quoteSummaryObj.result[0].financialData!!
        }
    }

    override suspend fun fundOwnership(ticker: String, refresh: Boolean): FundOwnership {
        return getData("$ticker-FundOwnership", refresh) {
            api.fundOwnership(ticker).quoteSummaryObj.result[0].fundOwnership!!
        }
    }

    override suspend fun incomeStatementHistory(ticker: String, refresh: Boolean): IncomeStatementHistory {
        return getData("$ticker-IncomeStatementHistory", refresh) {
            api.incomeStatementHistory(ticker).quoteSummaryObj.result[0].incomeStatementHistory!!
        }
    }

    override suspend fun incomeStatementHistoryQuarterly(ticker: String, refresh: Boolean): IncomeStatementHistory {
        return getData("$ticker-IncomeStatementHistoryQuarterly", refresh) {
            api.incomeStatementHistoryQuarterly(ticker).quoteSummaryObj.result[0].incomeStatementHistoryQuarterly!!
        }
    }

    override suspend fun indexTrend(ticker: String, refresh: Boolean): IndexTrend {
        return getData("$ticker-IndexTrend", refresh) {
            api.indexTrend(ticker).quoteSummaryObj.result[0].indexTrend!!
        }
    }

    override suspend fun industryTrend(ticker: String, refresh: Boolean): IndexTrend {
        return getData("$ticker-IndustryTrend", refresh) {
            api.industryTrend(ticker).quoteSummaryObj.result[0].industryTrend!!
        }
    }

    override suspend fun insiderHolders(ticker: String, refresh: Boolean): InsiderHolders {
        return getData("$ticker-InsiderHolders", refresh) {
            api.insiderHolders(ticker).quoteSummaryObj.result[0].insiderHolders!!
        }
    }

    override suspend fun insiderTransactions(ticker: String, refresh: Boolean): InsiderTransactions {
        return getData("$ticker-InsiderTransactions", refresh) {
            api.insiderTransactions(ticker).quoteSummaryObj.result[0].insiderTransactions!!
        }
    }

    override suspend fun institutionOwnership(ticker: String, refresh: Boolean): InstitutionOwnership {
        return getData("$ticker-InstitutionOwnership", refresh) {
            api.institutionOwnership(ticker).quoteSummaryObj.result[0].institutionOwnership!!
        }
    }

    override suspend fun majorDirectHolders(ticker: String, refresh: Boolean): MajorDirectHolders {
        return getData("$ticker-MajorDirectHolders", refresh) {
            api.majorDirectHolders(ticker).quoteSummaryObj.result[0].majorDirectHolders!!
        }
    }

    override suspend fun majorHoldersBreakdown(ticker: String, refresh: Boolean): MajorHoldersBreakdown {
        return getData("$ticker-MajorHoldersBreakdown", refresh) {
            api.majorHoldersBreakdown(ticker).quoteSummaryObj.result[0].majorHoldersBreakdown!!
        }
    }

    override suspend fun netSharePurchaseActivity(ticker: String, refresh: Boolean): NetSharePurchaseActivity {
        return getData("$ticker-NetSharePurchaseActivity", refresh) {
            api.netSharePurchaseActivity(ticker).quoteSummaryObj.result[0].netSharePurchaseActivity!!
        }
    }

    override suspend fun price(ticker: String, refresh: Boolean): Price {
        return getData("$ticker-Price", refresh) {
            api.price(ticker).quoteSummaryObj.result[0].price!!
        }
    }

    override suspend fun quoteType(ticker: String, refresh: Boolean): QuoteType {
        return getData("$ticker-QuoteType", refresh) { api.quoteType(ticker).quoteSummaryObj.result[0].quoteType!! }
    }

    override suspend fun recommendationTrend(ticker: String, refresh: Boolean): RecommendationTrend {
        return getData("$ticker-RecommendationTrend", refresh) {
            api.recommendationTrend(ticker).quoteSummaryObj.result[0].recommendationTrend!!
        }
    }

    override suspend fun secFilings(ticker: String, refresh: Boolean): SecFilings {
        return getData("$ticker-SecFilings", refresh) {
            api.secFilings(ticker).quoteSummaryObj.result[0].secFilings!!
        }
    }

    override suspend fun sectorTrend(ticker: String, refresh: Boolean): IndexTrend {
        return getData("$ticker-SectorTrend", refresh) {
            api.sectorTrend(ticker).quoteSummaryObj.result[0].sectorTrend!!
        }
    }

    override suspend fun summaryDetail(ticker: String, refresh: Boolean): SummaryDetail {
        return getData("$ticker-SummaryDetail", refresh) {
            api.summaryDetail(ticker).quoteSummaryObj.result[0].summaryDetail!!
        }
    }

    override suspend fun upgradeDowngradeHistory(ticker: String, refresh: Boolean): UpgradeDowngradeHistory {
        return getData("$ticker-UpgradeDowngradeHistory", refresh) {
            api.upgradeDowngradeHistory(ticker).quoteSummaryObj.result[0].upgradeDowngradeHistory!!
        }
    }

    private inline fun <reified T> getData(key: String, refresh: Boolean, fetch: () -> T): T {
        return if (refresh) {
            fetch.invoke().also {
                cache.saveJsonString(key, Json.encodeToString(it))
            }
        } else {
            cache.getJsonString(key)
                ?.let { Json.decodeFromString(it) }
                ?: fetch.invoke().also {
                    cache.saveJsonString(key, Json.encodeToString(it))
                }
        }
    }
}