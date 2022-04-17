package vorobeij.yfinance

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable data class QuoteSummaryResponse(
    @SerialName("quoteSummary") val quoteSummaryObj: QuoteSummaryObj
)

@Serializable data class QuoteSummaryObj(
    @SerialName("error") val error: String? = null,
    @SerialName("result") val result: List<Summary>
)

@Serializable data class Summary(
    @SerialName("assetProfile") val assetProfile: AssetProfile? = null,
    @SerialName("balanceSheetHistory") val balanceSheetHistory: BalanceSheetHistory? = null,
    @SerialName("balanceSheetHistoryQuarterly") val balanceSheetHistoryQuarterly: BalanceSheetHistory? = null,
    @SerialName("calendarEvents") val calendarEvents: CalendarEvents? = null,
    @SerialName("cashflowStatementHistory") val cashflowStatementHistory: CashflowStatementHistory? = null,
    @SerialName("cashflowStatementHistoryQuarterly") val cashflowStatementHistoryQuarterly: CashflowStatementHistory? = null,
    @SerialName("defaultKeyStatistics") val defaultKeyStatistics: DefaultKeyStatistics? = null,
    @SerialName("earnings") val earnings: EarningsOverview? = null,
    @SerialName("earningsHistory") val earningsHistory: EarningsHistory? = null,
    @SerialName("earningsTrend") val earningsTrend: EarningsTrend? = null,
    @SerialName("financialData") val financialData: FinancialData? = null,
    @SerialName("fundOwnership") val fundOwnership: FundOwnership? = null,
    @SerialName("incomeStatementHistory") val incomeStatementHistory: IncomeStatementHistory? = null,
    @SerialName("incomeStatementHistoryQuarterly") val incomeStatementHistoryQuarterly: IncomeStatementHistory? = null,
    @SerialName("indexTrend") val indexTrend: IndexTrend? = null,
    @SerialName("industryTrend") val industryTrend: IndexTrend? = null,
    @SerialName("insiderHolders") val insiderHolders: InsiderHolders? = null,
    @SerialName("insiderTransactions") val insiderTransactions: InsiderTransactions? = null,
    @SerialName("institutionOwnership") val institutionOwnership: InstitutionOwnership? = null,
    @SerialName("majorDirectHolders") val majorDirectHolders: MajorDirectHolders? = null,
    @SerialName("majorHoldersBreakdown") val majorHoldersBreakdown: MajorHoldersBreakdown? = null,
    @SerialName("netSharePurchaseActivity") val netSharePurchaseActivity: NetSharePurchaseActivity? = null,
    @SerialName("price") val price: Price? = null,
    @SerialName("quoteType") val quoteType: QuoteType? = null,
    @SerialName("recommendationTrend") val recommendationTrend: RecommendationTrend? = null,
    @SerialName("secFilings") val secFilings: SecFilings? = null,
    @SerialName("sectorTrend") val sectorTrend: IndexTrend? = null,
    @SerialName("summaryDetail") val summaryDetail: SummaryDetail? = null,
    @SerialName("summaryProfile") val summaryProfile: AssetProfile? = null,
    @SerialName("upgradeDowngradeHistory") val upgradeDowngradeHistory: UpgradeDowngradeHistory? = null
)

@Serializable data class AssetProfile(
    @SerialName("address1") val address1: String? = null,
    @SerialName("address2") val address2: String? = null,
    @SerialName("fax") val fax: String? = null,
    @SerialName("auditRisk") val auditRisk: Int? = null,
    @SerialName("boardRisk") val boardRisk: Int? = null,
    @SerialName("city") val city: String? = null,
    @SerialName("companyOfficers") val compStringOfficers: List<CompanyOfficer>,
    @SerialName("compensationAsOfEpochDate") val compensationAsOfEpochDate: Int? = null,
    @SerialName("compensationRisk") val compensationRisk: Int? = null,
    @SerialName("country") val country: String? = null,
    @SerialName("fullTimeEmployees") val fullTimeEmployees: Int? = null,
    @SerialName("governanceEpochDate") val governanceEpochDate: Int? = null,
    @SerialName("industry") val industry: String? = null,
    @SerialName("longBusinessSummary") val longBusinessSummary: String? = null,
    @SerialName("maxAge") val maxAge: Int? = null,
    @SerialName("overallRisk") val overallRisk: Int? = null,
    @SerialName("phone") val phone: String? = null,
    @SerialName("sector") val sector: String? = null,
    @SerialName("shareHolderRightsRisk") val shareHolderRightsRisk: Int? = null,
    @SerialName("state") val state: String? = null,
    @SerialName("website") val website: String? = null,
    @SerialName("zip") val zip: String
)

@Serializable data class BalanceSheetHistory(
    @SerialName("balanceSheetStatements") val balanceSheetStatements: List<BalanceSheetStatement>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class CalendarEvents(
    @SerialName("dividendDate") val dividendDate: DataEntry? = null,
    @SerialName("earnings") val earnings: Earnings,
    @SerialName("exDividendDate") val exDividendDate: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class CashflowStatementHistory(
    @SerialName("cashflowStatements") val cashflowStatements: List<CashflowStatement>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class DefaultKeyStatistics(
    @SerialName("annualHoldingsTurnover") val annualHoldingsTurnover: DataEntry? = null,
    @SerialName("annualReportExpenseRatio") val annualReportExpenseRatio: DataEntry? = null,
    @SerialName("beta") val beta: DataEntry? = null,
    @SerialName("beta3Year") val beta3Year: DataEntry? = null,
    @SerialName("bookValue") val bookValue: DataEntry? = null,
    @SerialName("category") val category: String? = null,
    @SerialName("dateShortInterest") val dateShortInterest: DataEntry? = null,
    @SerialName("earningsQuarterlyGrowth") val earningsQuarterlyGrowth: DataEntry? = null,
    @SerialName("enterpriseToEbitda") val enterpriseToEbitda: DataEntry? = null,
    @SerialName("enterpriseToRevenue") val enterpriseToRevenue: DataEntry? = null,
    @SerialName("enterpriseValue") val enterpriseValue: DataEntry? = null,
    @SerialName("fiveYearAverageReturn") val fiveYearAverageReturn: DataEntry? = null,
    @SerialName("floatShares") val floatShares: DataEntry? = null,
    @SerialName("forwardEps") val forwardEps: DataEntry? = null,
    @SerialName("forwardPE") val forwardPE: DataEntry? = null,
    @SerialName("fundFamily") val fundFamily: String?,
    @SerialName("fundInceptionDate") val fundInceptionDate: DataEntry? = null,
    @SerialName("heldPercentInsiders") val heldPercentInsiders: DataEntry? = null,
    @SerialName("heldPercentInstitutions") val heldPercentInstitutions: DataEntry? = null,
    @SerialName("impliedSharesOutstanding") val impliedSharesOutstanding: DataEntry? = null,
    @SerialName("lastCapGain") val lastCapGain: DataEntry? = null,
    @SerialName("lastDividendDate") val lastDividendDate: DataEntry? = null,
    @SerialName("lastDividendValue") val lastDividendValue: DataEntry? = null,
    @SerialName("lastFiscalYearEnd") val lastFiscalYearEnd: DataEntry? = null,
    @SerialName("lastSplitDate") val lastSplitDate: DataEntry? = null,
    @SerialName("lastSplitFactor") val lastSplitFactor: String? = null,
    @SerialName("legalType") val legalType: String? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("morningStarOverallRating") val morningStarOverallRating: DataEntry? = null,
    @SerialName("morningStarRiskRating") val morningStarRiskRating: DataEntry? = null,
    @SerialName("mostRecentQuarter") val mostRecentQuarter: DataEntry? = null,
    @SerialName("netIncomeToCommon") val netIncomeToCommon: DataEntry? = null,
    @SerialName("nextFiscalYearEnd") val nextFiscalYearEnd: DataEntry? = null,
    @SerialName("pegRatio") val pegRatio: DataEntry? = null,
    @SerialName("priceHint") val priceHint: DataEntry? = null,
    @SerialName("priceToBook") val priceToBook: DataEntry? = null,
    @SerialName("priceToSalesTrailing12Months") val priceToSalesTrailing12Months: DataEntry? = null,
    @SerialName("profitMargins") val profitMargins: DataEntry? = null,
    @SerialName("revenueQuarterlyGrowth") val revenueQuarterlyGrowth: DataEntry? = null,
    @SerialName("SandP52WeekChange") val sandP52WeekChange: DataEntry? = null,
    @SerialName("sharesOutstanding") val sharesOutstanding: DataEntry? = null,
    @SerialName("sharesPercentSharesOut") val sharesPercentSharesOut: DataEntry? = null,
    @SerialName("sharesShort") val sharesShort: DataEntry? = null,
    @SerialName("sharesShortPreviousMonthDate") val sharesShortPreviousMonthDate: DataEntry? = null,
    @SerialName("sharesShortPriorMonth") val sharesShortPriorMonth: DataEntry? = null,
    @SerialName("shortPercentOfFloat") val shortPercentOfFloat: DataEntry? = null,
    @SerialName("shortRatio") val shortRatio: DataEntry? = null,
    @SerialName("threeYearAverageReturn") val threeYearAverageReturn: DataEntry? = null,
    @SerialName("totalAssets") val totalAssets: DataEntry? = null,
    @SerialName("trailingEps") val trailingEps: DataEntry? = null,
    @SerialName("52WeekChange") val weekChange: DataEntry? = null,
    @SerialName("yield") val yield: DataEntry? = null,
    @SerialName("ytdReturn") val ytdReturn: DataEntry
)

@Serializable data class EarningsOverview(
    @SerialName("earningsChart") val earningsChart: EarningsChart,
    @SerialName("financialCurrency") val financialCurrency: String? = null,
    @SerialName("financialsChart") val financialsChart: FinancialsChart,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class EarningsHistory(
    @SerialName("history") val history: List<History>, @SerialName("maxAge") val maxAge: Int
)

@Serializable data class EarningsTrend(
    @SerialName("maxAge") val maxAge: Int, @SerialName("trend") val trend: List<Trend>
)

@Serializable data class FinancialData(
    @SerialName("currentPrice") val currentPrice: DataEntry? = null,
    @SerialName("currentRatio") val currentRatio: DataEntry? = null,
    @SerialName("debtToEquity") val debtToEquity: DataEntry? = null,
    @SerialName("earningsGrowth") val earningsGrowth: DataEntry? = null,
    @SerialName("ebitda") val ebitda: DataEntry? = null,
    @SerialName("ebitdaMargins") val ebitdaMargins: DataEntry? = null,
    @SerialName("financialCurrency") val financialCurrency: String? = null,
    @SerialName("freeCashflow") val freeCashflow: DataEntry? = null,
    @SerialName("grossMargins") val grossMargins: DataEntry? = null,
    @SerialName("grossProfits") val grossProfits: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("numberOfAnalystOpinions") val numberOfAnalystOpinions: DataEntry? = null,
    @SerialName("operatingCashflow") val operatingCashflow: DataEntry? = null,
    @SerialName("operatingMargins") val operatingMargins: DataEntry? = null,
    @SerialName("profitMargins") val profitMargins: DataEntry? = null,
    @SerialName("quickRatio") val quickRatio: DataEntry? = null,
    @SerialName("recommendationKey") val recommendationKey: String? = null,
    @SerialName("recommendationMean") val recommendationMean: DataEntry? = null,
    @SerialName("returnOnAssets") val returnOnAssets: DataEntry? = null,
    @SerialName("returnOnEquity") val returnOnEquity: DataEntry? = null,
    @SerialName("revenueGrowth") val revenueGrowth: DataEntry? = null,
    @SerialName("revenuePerShare") val revenuePerShare: DataEntry? = null,
    @SerialName("targetHighPrice") val targetHighPrice: DataEntry? = null,
    @SerialName("targetLowPrice") val targetLowPrice: DataEntry? = null,
    @SerialName("targetMeanPrice") val targetMeanPrice: DataEntry? = null,
    @SerialName("targetMedianPrice") val targetMedianPrice: DataEntry? = null,
    @SerialName("totalCash") val totalCash: DataEntry? = null,
    @SerialName("totalCashPerShare") val totalCashPerShare: DataEntry? = null,
    @SerialName("totalDebt") val totalDebt: DataEntry? = null,
    @SerialName("totalRevenue") val totalRevenue: DataEntry
)

@Serializable data class FundOwnership(
    @SerialName("maxAge") val maxAge: Int, @SerialName("ownershipList") val ownershipList: List<Ownership>
)

@Serializable data class IncomeStatementHistory(
    @SerialName("incomeStatementHistory") val incomeStatementHistory: List<IncomeStatementHistoryItem>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class IncomeStatementHistoryItem(
    @SerialName("costOfRevenue") val costOfRevenue: DataEntry? = null,
    @SerialName("discontinuedOperations") val discontinuedOperations: DataEntry? = null,
    @SerialName("ebit") val ebit: DataEntry? = null,
    @SerialName("effectOfAccountingCharges") val effectOfAccountingCharges: DataEntry? = null,
    @SerialName("endDate") val endDate: DataEntry? = null,
    @SerialName("extraordinaryItems") val extraordinaryItems: DataEntry? = null,
    @SerialName("grossProfit") val grossProfit: DataEntry? = null,
    @SerialName("incomeBeforeTax") val incomeBeforeTax: DataEntry? = null,
    @SerialName("incomeTaxExpense") val incomeTaxExpense: DataEntry? = null,
    @SerialName("interestExpense") val interestExpense: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("minorityInterest") val minorityInterest: DataEntry? = null,
    @SerialName("netIncome") val netIncome: DataEntry? = null,
    @SerialName("netIncomeApplicableToCommonShares") val netIncomeApplicableToCommonShares: DataEntry? = null,
    @SerialName("netIncomeFromContinuingOps") val netIncomeFromContinuingOps: DataEntry? = null,
    @SerialName("nonRecurring") val nonRecurring: DataEntry? = null,
    @SerialName("operatingIncome") val operatingIncome: DataEntry? = null,
    @SerialName("otherItems") val otherItems: DataEntry? = null,
    @SerialName("otherOperatingExpenses") val otherOperatingExpenses: DataEntry? = null,
    @SerialName("researchDevelopment") val researchDevelopment: DataEntry? = null,
    @SerialName("sellingGeneralAdministrative") val sellingGeneralAdministrative: DataEntry? = null,
    @SerialName("totalOperatingExpenses") val totalOperatingExpenses: DataEntry? = null,
    @SerialName("totalOtherIncomeExpenseNet") val totalOtherIncomeExpenseNet: DataEntry? = null,
    @SerialName("totalRevenue") val totalRevenue: DataEntry
)

@Serializable data class IndexTrend(
    @SerialName("estimates") val estimates: List<Estimation>,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("peRatio") val peRatio: DataEntry? = null,
    @SerialName("pegRatio") val pegRatio: DataEntry? = null,
    @SerialName("symbol") val symbol: String? = null
)

@Serializable data class InsiderHolders(
    @SerialName("holders") val holders: List<Holder>, @SerialName("maxAge") val maxAge: Int
)

@Serializable data class InsiderTransactions(
    @SerialName("maxAge") val maxAge: Int, @SerialName("transactions") val transactions: List<Transaction>
)

@Serializable data class InstitutionOwnership(
    @SerialName("maxAge") val maxAge: Int, @SerialName("ownershipList") val ownershipList: List<Ownership>
)

@Serializable data class MajorDirectHolders(
    @SerialName("holders") val holders: List<String>, @SerialName("maxAge") val maxAge: Int
)

@Serializable data class MajorHoldersBreakdown(
    @SerialName("insidersPercentHeld") val insidersPercentHeld: DataEntry? = null,
    @SerialName("institutionsCount") val institutionsCount: DataEntry? = null,
    @SerialName("institutionsFloatPercentHeld") val institutionsFloatPercentHeld: DataEntry? = null,
    @SerialName("institutionsPercentHeld") val institutionsPercentHeld: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class NetSharePurchaseActivity(
    @SerialName("buyInfoCount") val buyInfoCount: DataEntry? = null,
    @SerialName("buyInfoShares") val buyInfoShares: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("netInfoCount") val netInfoCount: DataEntry? = null,
    @SerialName("netInfoShares") val netInfoShares: DataEntry? = null,
    @SerialName("netPercentInsiderShares") val netPercentInsiderShares: DataEntry? = null,
    @SerialName("buyPercentInsiderShares") val buyPercentInsiderShares: DataEntry? = null,
    @SerialName("sellPercentInsiderShares") val sellPercentInsiderShares: DataEntry? = null,
    @SerialName("period") val period: String? = null,
    @SerialName("sellInfoCount") val sellInfoCount: DataEntry? = null,
    @SerialName("sellInfoShares") val sellInfoShares: DataEntry? = null,
    @SerialName("totalInsiderShares") val totalInsiderShares: DataEntry
)

@Serializable data class Price(
    @SerialName("averageDailyVolume10Day") val averageDailyVolume10Day: DataEntry? = null,
    @SerialName("averageDailyVolume3Month") val averageDailyVolume3Month: DataEntry? = null,
    @SerialName("circulatingSupply") val circulatingSupply: DataEntry? = null,
    @SerialName("currency") val currency: String? = null,
    @SerialName("currencySymbol") val currencySymbol: String? = null,
    @SerialName("exchange") val exchange: String? = null,
    @SerialName("exchangeDataDelayedBy") val exchangeDataDelayedBy: Int,
    @SerialName("exchangeName") val exchangeName: String? = null,
    @SerialName("fromCurrency") val fromCurrency: String? = null,
    @SerialName("lastMarket") val lastMarket: String? = null,
    @SerialName("longName") val longName: String? = null,
    @SerialName("marketCap") val marketCap: DataEntry? = null,
    @SerialName("marketState") val marketState: String? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("openInterest") val openInterest: DataEntry? = null,
    @SerialName("postMarketChange") val postMarketChange: DataEntry? = null,
    @SerialName("postMarketChangePercent") val postMarketChangePercent: DataEntry? = null,
    @SerialName("postMarketPrice") val postMarketPrice: DataEntry? = null,
    @SerialName("postMarketSource") val postMarketSource: String? = null,
    @SerialName("postMarketTime") val postMarketTime: Int? = null,
    @SerialName("preMarketChange") val preMarketChange: DataEntry? = null,
    @SerialName("preMarketPrice") val preMarketPrice: DataEntry? = null,
    @SerialName("preMarketSource") val preMarketSource: String? = null,
    @SerialName("priceHint") val priceHint: DataEntry? = null,
    @SerialName("quoteSourceName") val quoteSourceName: String? = null,
    @SerialName("quoteType") val quoteType: String? = null,
    @SerialName("regularMarketChange") val regularMarketChange: DataEntry? = null,
    @SerialName("regularMarketChangePercent") val regularMarketChangePercent: DataEntry? = null,
    @SerialName("regularMarketDayHigh") val regularMarketDayHigh: DataEntry? = null,
    @SerialName("regularMarketDayLow") val regularMarketDayLow: DataEntry? = null,
    @SerialName("regularMarketOpen") val regularMarketOpen: DataEntry? = null,
    @SerialName("regularMarketPreviousClose") val regularMarketPreviousClose: DataEntry? = null,
    @SerialName("regularMarketPrice") val regularMarketPrice: DataEntry? = null,
    @SerialName("regularMarketSource") val regularMarketSource: String? = null,
    @SerialName("regularMarketTime") val regularMarketTime: Int,
    @SerialName("regularMarketVolume") val regularMarketVolume: DataEntry? = null,
    @SerialName("shortName") val shortName: String? = null,
    @SerialName("strikePrice") val strikePrice: DataEntry? = null,
    @SerialName("symbol") val symbol: String? = null,
    @SerialName("toCurrency") val toCurrency: String? = null,
    @SerialName("underlyingSymbol") val underlyingSymbol: String? = null,
    @SerialName("volume24Hr") val volume24Hr: DataEntry? = null,
    @SerialName("volumeAllCurrencies") val volumeAllCurrencies: DataEntry
)

@Serializable data class QuoteType(
    @SerialName("exchange") val exchange: String? = null,
    @SerialName("firstTradeDateEpochUtc") val firstTradeDateEpochUtc: Int,
    @SerialName("gmtOffSetMilliseconds") val gmtOffSetMilliseconds: Int,
    @SerialName("longName") val longName: String? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("messageBoardId") val messageBoardId: String? = null,
    @SerialName("quoteType") val quoteType: String? = null,
    @SerialName("shortName") val shortName: String? = null,
    @SerialName("symbol") val symbol: String? = null,
    @SerialName("timeZoneFullName") val timeZoneFullName: String? = null,
    @SerialName("timeZoneShortName") val timeZoneShortName: String? = null,
    @SerialName("underlyingSymbol") val underlyingSymbol: String? = null,
    @SerialName("uuid") val uuid: String
)

@Serializable data class RecommendationTrend(
    @SerialName("maxAge") val maxAge: Int, @SerialName("trend") val trend: List<TrendEstimation>
)

@Serializable data class SecFilings(
    @SerialName("filings") val filings: List<Filing>, @SerialName("maxAge") val maxAge: Int
)

@Serializable data class Estimation(
    @SerialName("growth") val growth: DataEntry? = null, @SerialName("period") val period: String
)

@Serializable data class SummaryDetail(
    @SerialName("algorithm") val algorithm: String? = null,
    @SerialName("ask") val ask: DataEntry? = null,
    @SerialName("askSize") val askSize: DataEntry? = null,
    @SerialName("averageDailyVolume10Day") val averageDailyVolume10Day: DataEntry? = null,
    @SerialName("averageVolume") val averageVolume: DataEntry? = null,
    @SerialName("averageVolume10days") val averageVolume10days: DataEntry? = null,
    @SerialName("beta") val beta: DataEntry? = null,
    @SerialName("bid") val bid: DataEntry? = null,
    @SerialName("bidSize") val bidSize: DataEntry? = null,
    @SerialName("circulatingSupply") val circulatingSupply: DataEntry? = null,
    @SerialName("currency") val currency: String? = null,
    @SerialName("dayHigh") val dayHigh: DataEntry? = null,
    @SerialName("dayLow") val dayLow: DataEntry? = null,
    @SerialName("dividendRate") val dividendRate: DataEntry? = null,
    @SerialName("dividendYield") val dividendYield: DataEntry? = null,
    @SerialName("exDividendDate") val exDividendDate: DataEntry? = null,
    @SerialName("expireDate") val expireDate: DataEntry? = null,
    @SerialName("fiftyDayAverage") val fiftyDayAverage: DataEntry? = null,
    @SerialName("fiftyTwoWeekHigh") val fiftyTwoWeekHigh: DataEntry? = null,
    @SerialName("fiftyTwoWeekLow") val fiftyTwoWeekLow: DataEntry? = null,
    @SerialName("fiveYearAvgDividendYield") val fiveYearAvgDividendYield: DataEntry? = null,
    @SerialName("forwardPE") val forwardPE: DataEntry? = null,
    @SerialName("fromCurrency") val fromCurrency: String? = null,
    @SerialName("lastMarket") val lastMarket: String? = null,
    @SerialName("marketCap") val marketCap: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("maxSupply") val maxSupply: DataEntry? = null,
    @SerialName("navPrice") val navPrice: DataEntry? = null,
    @SerialName("open") val `open`: DataEntry? = null,
    @SerialName("openInterest") val openInterest: DataEntry? = null,
    @SerialName("payoutRatio") val payoutRatio: DataEntry? = null,
    @SerialName("previousClose") val previousClose: DataEntry? = null,
    @SerialName("priceHint") val priceHint: DataEntry? = null,
    @SerialName("priceToSalesTrailing12Months") val priceToSalesTrailing12Months: DataEntry? = null,
    @SerialName("regularMarketDayHigh") val regularMarketDayHigh: DataEntry? = null,
    @SerialName("regularMarketDayLow") val regularMarketDayLow: DataEntry? = null,
    @SerialName("regularMarketOpen") val regularMarketOpen: DataEntry? = null,
    @SerialName("regularMarketPreviousClose") val regularMarketPreviousClose: DataEntry? = null,
    @SerialName("regularMarketVolume") val regularMarketVolume: DataEntry? = null,
    @SerialName("startDate") val startDate: DataEntry? = null,
    @SerialName("strikePrice") val strikePrice: DataEntry? = null,
    @SerialName("toCurrency") val toCurrency: String? = null,
    @SerialName("totalAssets") val totalAssets: DataEntry? = null,
    @SerialName("tradeable") val tradeable: Boolean,
    @SerialName("trailingAnnualDividendRate") val trailingAnnualDividendRate: DataEntry? = null,
    @SerialName("trailingAnnualDividendYield") val trailingAnnualDividendYield: DataEntry? = null,
    @SerialName("trailingPE") val trailingPE: DataEntry? = null,
    @SerialName("twoHundredDayAverage") val twoHundredDayAverage: DataEntry? = null,
    @SerialName("volume") val volume: DataEntry? = null,
    @SerialName("volume24Hr") val volume24Hr: DataEntry? = null,
    @SerialName("volumeAllCurrencies") val volumeAllCurrencies: DataEntry? = null,
    @SerialName("yield") val yield: DataEntry? = null,
    @SerialName("ytdReturn") val ytdReturn: DataEntry
)

@Serializable data class UpgradeDowngradeHistory(
    @SerialName("history") val history: List<UpgradeDowngradeHistoryItem>, @SerialName("maxAge") val maxAge: Int
)

@Serializable data class UpgradeDowngradeHistoryItem(
    @SerialName("action") val action: String? = null,
    @SerialName("epochGradeDate") val epochGradeDate: Int,
    @SerialName("firm") val firm: String? = null,
    @SerialName("fromGrade") val fromGrade: String? = null,
    @SerialName("toGrade") val toGrade: String
)

@Serializable data class CompanyOfficer(
    @SerialName("age") val age: Int? = null,
    @SerialName("exercisedValue") val exercisedValue: DataEntry? = null,
    @SerialName("fiscalYear") val fiscalYear: Int? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("name") val name: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("totalPay") val totalPay: DataEntry? = null,
    @SerialName("unexercisedValue") val unexercisedValue: DataEntry? = null,
    @SerialName("yearBorn") val yearBorn: Int? = null
)

@Serializable data class BalanceSheetStatement(
    @SerialName("accountsPayable") val accountsPayable: DataEntry? = null,
    @SerialName("cash") val cash: DataEntry? = null,
    @SerialName("commonStock") val commonStock: DataEntry? = null,
    @SerialName("endDate") val endDate: DataEntry? = null,
    @SerialName("inventory") val inventory: DataEntry? = null,
    @SerialName("longTermDebt") val longTermDebt: DataEntry? = null,
    @SerialName("longTermInvestments") val longTermInvestments: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("netReceivables") val netReceivables: DataEntry? = null,
    @SerialName("netTangibleAssets") val netTangibleAssets: DataEntry? = null,
    @SerialName("otherAssets") val otherAssets: DataEntry? = null,
    @SerialName("otherCurrentAssets") val otherCurrentAssets: DataEntry? = null,
    @SerialName("otherCurrentLiab") val otherCurrentLiab: DataEntry? = null,
    @SerialName("otherLiab") val otherLiab: DataEntry? = null,
    @SerialName("otherStockholderEquity") val otherStockholderEquity: DataEntry? = null,
    @SerialName("propertyPlantEquipment") val propertyPlantEquipment: DataEntry? = null,
    @SerialName("goodWill") val goodWill: DataEntry? = null,
    @SerialName("intangibleAssets") val intangibleAssets: DataEntry? = null,
    @SerialName("retainedEarnings") val retainedEarnings: DataEntry? = null,
    @SerialName("shortLongTermDebt") val shortLongTermDebt: DataEntry? = null,
    @SerialName("shortTermInvestments") val shortTermInvestments: DataEntry? = null,
    @SerialName("totalAssets") val totalAssets: DataEntry? = null,
    @SerialName("totalCurrentAssets") val totalCurrentAssets: DataEntry? = null,
    @SerialName("totalCurrentLiabilities") val totalCurrentLiabilities: DataEntry? = null,
    @SerialName("totalLiab") val totalLiab: DataEntry? = null,
    @SerialName("totalStockholderEquity") val totalStockholderEquity: DataEntry? = null,
    @SerialName("treasuryStock") val treasuryStock: DataEntry? = null,
    @SerialName("capitalSurplus") val capitalSurplus: DataEntry? = null,
    @SerialName("deferredLongTermAssetCharges") val deferredLongTermAssetCharges: DataEntry? = null,
    @SerialName("deferredLongTermLiab") val deferredLongTermLiab: DataEntry? = null,
    @SerialName("minorityInterest") val minorityInterest: DataEntry? = null,
)

@Serializable data class Earnings(
    @SerialName("earningsAverage") val earningsAverage: DataEntry? = null,
    @SerialName("earningsDate") val earningsDate: List<DataEntry>,
    @SerialName("earningsHigh") val earningsHigh: DataEntry? = null,
    @SerialName("earningsLow") val earningsLow: DataEntry? = null,
    @SerialName("revenueAverage") val revenueAverage: DataEntry? = null,
    @SerialName("revenueHigh") val revenueHigh: DataEntry? = null,
    @SerialName("revenueLow") val revenueLow: DataEntry
)


@Serializable data class CashflowStatement(
    @SerialName("capitalExpenditures") val capitalExpenditures: DataEntry? = null,
    @SerialName("changeInCash") val changeInCash: DataEntry? = null,
    @SerialName("changeToAccountReceivables") val changeToAccountReceivables: DataEntry? = null,
    @SerialName("changeToInventory") val changeToInventory: DataEntry? = null,
    @SerialName("changeToLiabilities") val changeToLiabilities: DataEntry? = null,
    @SerialName("changeToNetincome") val changeToNetincome: DataEntry? = null,
    @SerialName("changeToOperatingActivities") val changeToOperatingActivities: DataEntry? = null,
    @SerialName("depreciation") val depreciation: DataEntry? = null,
    @SerialName("dividendsPaid") val dividendsPaid: DataEntry? = null,
    @SerialName("effectOfExchangeRate") val effectOfExchangeRate: DataEntry? = null,
    @SerialName("endDate") val endDate: DataEntry? = null,
    @SerialName("investments") val investments: DataEntry? = null,
    @SerialName("issuanceOfStock") val issuanceOfStock: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("netBorrowings") val netBorrowings: DataEntry? = null,
    @SerialName("netIncome") val netIncome: DataEntry? = null,
    @SerialName("otherCashflowsFromFinancingActivities") val otherCashflowsFromFinancingActivities: DataEntry? = null,
    @SerialName("otherCashflowsFromInvestingActivities") val otherCashflowsFromInvestingActivities: DataEntry? = null,
    @SerialName("repurchaseOfStock") val repurchaseOfStock: DataEntry? = null,
    @SerialName("totalCashFromFinancingActivities") val totalCashFromFinancingActivities: DataEntry? = null,
    @SerialName("totalCashFromOperatingActivities") val totalCashFromOperatingActivities: DataEntry? = null,
    @SerialName("totalCashflowsFromInvestingActivities") val totalCashflowsFromInvestingActivities: DataEntry? = null
)

@Serializable data class EarningsChart(
    @SerialName("currentQuarterEstimate") val currentQuarterEstimate: DataEntry? = null,
    @SerialName("currentQuarterEstimateDate") val currentQuarterEstimateDate: String? = null,
    @SerialName("currentQuarterEstimateYear") val currentQuarterEstimateYear: Int,
    @SerialName("earningsDate") val earningsDate: List<DataEntry>,
    @SerialName("quarterly") val quarterly: List<Quarterly>
)

@Serializable data class FinancialsChart(
    @SerialName("quarterly") val quarterly: List<Quarterly>, @SerialName("yearly") val yearly: List<Yearly>
)

@Serializable data class Quarterly(
    @SerialName("actual") val `actual`: DataEntry? = null,
    @SerialName("date") val date: String? = null,
    @SerialName("estimate") val estimate: DataEntry? = null,
    @SerialName("revenue") val revenue: DataEntry? = null,
    @SerialName("earnings") val earnings: DataEntry? = null,
)

@Serializable data class Yearly(
    @SerialName("date") val date: Int,
    @SerialName("earnings") val earnings: DataEntry? = null,
    @SerialName("revenue") val revenue: DataEntry? = null
)

@Serializable data class History(
    @SerialName("epsActual") val epsActual: DataEntry? = null,
    @SerialName("epsDifference") val epsDifference: DataEntry? = null,
    @SerialName("epsEstimate") val epsEstimate: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("period") val period: String? = null,
    @SerialName("quarter") val quarter: DataEntry? = null,
    @SerialName("surprisePercent") val surprisePercent: DataEntry
)

@Serializable data class Trend(
    @SerialName("earningsEstimate") val earningsEstimate: EarningsEstimate,
    @SerialName("endDate") val endDate: String?,
    @SerialName("epsRevisions") val epsRevisions: EpsRevisions,
    @SerialName("epsTrend") val epsTrend: EpsTrend,
    @SerialName("growth") val growth: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("period") val period: String? = null,
    @SerialName("revenueEstimate") val revenueEstimate: RevenueEstimate
)

@Serializable data class TrendEstimation(
    @SerialName("buy") val buy: Int,
    @SerialName("hold") val hold: Int,
    @SerialName("period") val period: String? = null,
    @SerialName("sell") val sell: Int,
    @SerialName("strongBuy") val strongBuy: Int,
    @SerialName("strongSell") val strongSell: Int
)

@Serializable data class EarningsEstimate(
    @SerialName("avg") val avg: DataEntry? = null,
    @SerialName("growth") val growth: DataEntry? = null,
    @SerialName("high") val high: DataEntry? = null,
    @SerialName("low") val low: DataEntry? = null,
    @SerialName("numberOfAnalysts") val numberOfAnalysts: DataEntry? = null,
    @SerialName("yearAgoEps") val yearAgoEps: DataEntry
)

@Serializable data class EpsRevisions(
    @SerialName("downLast30days") val downLast30days: DataEntry? = null,
    @SerialName("downLast90days") val downLast90days: DataEntry? = null,
    @SerialName("upLast30days") val upLast30days: DataEntry? = null,
    @SerialName("upLast7days") val upLast7days: DataEntry
)

@Serializable data class EpsTrend(
    @SerialName("current") val current: DataEntry? = null,
    @SerialName("7daysAgo") val daysAgo7: DataEntry? = null,
    @SerialName("30daysAgo") val daysAgo30: DataEntry? = null,
    @SerialName("60daysAgo") val daysAgo60: DataEntry? = null,
    @SerialName("90daysAgo") val daysAgo90: DataEntry
)


@Serializable data class RevenueEstimate(
    @SerialName("avg") val avg: DataEntry? = null,
    @SerialName("growth") val growth: DataEntry? = null,
    @SerialName("high") val high: DataEntry? = null,
    @SerialName("low") val low: DataEntry? = null,
    @SerialName("numberOfAnalysts") val numberOfAnalysts: DataEntry? = null,
    @SerialName("yearAgoRevenue") val yearAgoRevenue: DataEntry
)

@Serializable data class Ownership(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("organization") val organization: String? = null,
    @SerialName("pctHeld") val pctHeld: DataEntry? = null,
    @SerialName("position") val position: DataEntry? = null,
    @SerialName("reportDate") val reportDate: DataEntry? = null,
    @SerialName("value") val value: DataEntry
)

@Serializable data class Holder(
    @SerialName("latestTransDate") val latestTransDate: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("name") val name: String? = null,
    @SerialName("positionDirect") val positionDirect: DataEntry? = null,
    @SerialName("positionDirectDate") val positionDirectDate: DataEntry? = null,
    @SerialName("positionSummaryDate") val positionSummaryDate: DataEntry? = null,
    @SerialName("positionIndirect") val positionIndirect: DataEntry? = null,
    @SerialName("positionIndirectDate") val positionIndirectDate: DataEntry? = null,
    @SerialName("relation") val relation: String? = null,
    @SerialName("transactionDescription") val transactionDescription: String? = null,
    @SerialName("url") val url: String
)

@Serializable data class DataEntry(
    @SerialName("fmt") val formatted: String? = null,
    @SerialName("longFmt") val longFormatted: String? = null,
    @SerialName("raw") val raw: Double? = null
)

@Serializable data class Transaction(
    @SerialName("filerName") val filerName: String? = null,
    @SerialName("filerRelation") val filerRelation: String? = null,
    @SerialName("filerUrl") val filerUrl: String? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("moneyText") val moneyText: String? = null,
    @SerialName("ownership") val ownership: String? = null,
    @SerialName("shares") val shares: DataEntry? = null,
    @SerialName("startDate") val startDate: DataEntry? = null,
    @SerialName("transactionText") val transactionText: String? = null,
    @SerialName("value") val value: DataEntry? = null
)

@Serializable data class Filing(
    @SerialName("date") val date: String? = null,
    @SerialName("edgarUrl") val edgarUrl: String? = null,
    @SerialName("epochDate") val epochDate: Int,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("title") val title: String? = null,
    @SerialName("type") val type: String
)
