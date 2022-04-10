package vorobeij.yfinance.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable data class QuoteSummaryResponse(
    @SerialName("quoteSummary") val quoteSummaryObj: QuoteSummaryObj
)

@Serializable data class QuoteSummaryObj(
    @SerialName("error") val error: String? = null,
    @SerialName("result") val result: List<Summary>
)

data class QuoteSummary(
    val summary: Summary
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
    @SerialName("summaryProfile") val summaryProfile: SummaryProfile? = null,
    @SerialName("upgradeDowngradeHistory") val upgradeDowngradeHistory: UpgradeDowngradeHistory? = null
)

@Serializable data class AssetProfile(
    @SerialName("address1") val address1: String,
    @SerialName("auditRisk") val auditRisk: Int,
    @SerialName("boardRisk") val boardRisk: Int,
    @SerialName("city") val city: String,
    @SerialName("companyOfficers") val compStringOfficers: List<CompanyOfficer>,
    @SerialName("compensationAsOfEpochDate") val compensationAsOfEpochDate: Int,
    @SerialName("compensationRisk") val compensationRisk: Int,
    @SerialName("country") val country: String,
    @SerialName("fullTimeEmployees") val fullTimeEmployees: Int,
    @SerialName("governanceEpochDate") val governanceEpochDate: Int,
    @SerialName("industry") val industry: String,
    @SerialName("longBusinessSummary") val longBusinessSummary: String,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("overallRisk") val overallRisk: Int,
    @SerialName("phone") val phone: String,
    @SerialName("sector") val sector: String,
    @SerialName("shareHolderRightsRisk") val shareHolderRightsRisk: Int,
    @SerialName("state") val state: String,
    @SerialName("website") val website: String,
    @SerialName("zip") val zip: String
)

@Serializable data class BalanceSheetHistory(
    @SerialName("balanceSheetStatements") val balanceSheetStatements: List<BalanceSheetStatement>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class CalendarEvents(
    @SerialName("dividendDate") val dividendDate: DataEntry,
    @SerialName("earnings") val earnings: Earnings,
    @SerialName("exDividendDate") val exDividendDate: DataEntry,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class CashflowStatementHistory(
    @SerialName("cashflowStatements") val cashflowStatements: List<CashflowStatement>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class DefaultKeyStatistics(
    @SerialName("annualHoldingsTurnover") val annualHoldingsTurnover: DataEntry,
    @SerialName("annualReportExpenseRatio") val annualReportExpenseRatio: DataEntry,
    @SerialName("beta") val beta: DataEntry,
    @SerialName("beta3Year") val beta3Year: DataEntry,
    @SerialName("bookValue") val bookValue: DataEntry,
    @SerialName("category") val category: String? = null,
    @SerialName("dateShortInterest") val dateShortInterest: DataEntry,
    @SerialName("earningsQuarterlyGrowth") val earningsQuarterlyGrowth: DataEntry,
    @SerialName("enterpriseToEbitda") val enterpriseToEbitda: DataEntry,
    @SerialName("enterpriseToRevenue") val enterpriseToRevenue: DataEntry,
    @SerialName("enterpriseValue") val enterpriseValue: DataEntry,
    @SerialName("fiveYearAverageReturn") val fiveYearAverageReturn: DataEntry,
    @SerialName("floatShares") val floatShares: DataEntry,
    @SerialName("forwardEps") val forwardEps: DataEntry,
    @SerialName("forwardPE") val forwardPE: DataEntry,
    @SerialName("fundFamily") val fundFamily: String?,
    @SerialName("fundInceptionDate") val fundInceptionDate: DataEntry,
    @SerialName("heldPercentInsiders") val heldPercentInsiders: DataEntry,
    @SerialName("heldPercentInstitutions") val heldPercentInstitutions: DataEntry,
    @SerialName("impliedSharesOutstanding") val impliedSharesOutstanding: DataEntry,
    @SerialName("lastCapGain") val lastCapGain: DataEntry,
    @SerialName("lastDividendDate") val lastDividendDate: DataEntry,
    @SerialName("lastDividendValue") val lastDividendValue: DataEntry,
    @SerialName("lastFiscalYearEnd") val lastFiscalYearEnd: DataEntry,
    @SerialName("lastSplitDate") val lastSplitDate: DataEntry,
    @SerialName("lastSplitFactor") val lastSplitFactor: String,
    @SerialName("legalType") val legalType: String? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("morningStarOverallRating") val morningStarOverallRating: DataEntry,
    @SerialName("morningStarRiskRating") val morningStarRiskRating: DataEntry,
    @SerialName("mostRecentQuarter") val mostRecentQuarter: DataEntry,
    @SerialName("netIncomeToCommon") val netIncomeToCommon: DataEntry,
    @SerialName("nextFiscalYearEnd") val nextFiscalYearEnd: DataEntry,
    @SerialName("pegRatio") val pegRatio: DataEntry,
    @SerialName("priceHint") val priceHint: DataEntry,
    @SerialName("priceToBook") val priceToBook: DataEntry,
    @SerialName("priceToSalesTrailing12Months") val priceToSalesTrailing12Months: DataEntry,
    @SerialName("profitMargins") val profitMargins: DataEntry,
    @SerialName("revenueQuarterlyGrowth") val revenueQuarterlyGrowth: DataEntry,
    @SerialName("SandP52WeekChange") val sandP52WeekChange: DataEntry,
    @SerialName("sharesOutstanding") val sharesOutstanding: DataEntry,
    @SerialName("sharesPercentSharesOut") val sharesPercentSharesOut: DataEntry,
    @SerialName("sharesShort") val sharesShort: DataEntry,
    @SerialName("sharesShortPreviousMonthDate") val sharesShortPreviousMonthDate: DataEntry,
    @SerialName("sharesShortPriorMonth") val sharesShortPriorMonth: DataEntry,
    @SerialName("shortPercentOfFloat") val shortPercentOfFloat: DataEntry,
    @SerialName("shortRatio") val shortRatio: DataEntry,
    @SerialName("threeYearAverageReturn") val threeYearAverageReturn: DataEntry,
    @SerialName("totalAssets") val totalAssets: DataEntry,
    @SerialName("trailingEps") val trailingEps: DataEntry,
    @SerialName("52WeekChange") val weekChange: DataEntry,
    @SerialName("yield") val yield: DataEntry,
    @SerialName("ytdReturn") val ytdReturn: DataEntry
)

@Serializable data class EarningsOverview(
    @SerialName("earningsChart") val earningsChart: EarningsChart,
    @SerialName("financialCurrency") val financialCurrency: String,
    @SerialName("financialsChart") val financialsChart: FinancialsChart,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class EarningsHistory(
    @SerialName("history") val history: List<History>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class EarningsTrend(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("trend") val trend: List<Trend>
)

@Serializable data class FinancialData(
    @SerialName("currentPrice") val currentPrice: DataEntry,
    @SerialName("currentRatio") val currentRatio: DataEntry,
    @SerialName("debtToEquity") val debtToEquity: DataEntry,
    @SerialName("earningsGrowth") val earningsGrowth: DataEntry,
    @SerialName("ebitda") val ebitda: DataEntry,
    @SerialName("ebitdaMargins") val ebitdaMargins: DataEntry,
    @SerialName("financialCurrency") val financialCurrency: String,
    @SerialName("freeCashflow") val freeCashflow: DataEntry,
    @SerialName("grossMargins") val grossMargins: DataEntry,
    @SerialName("grossProfits") val grossProfits: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("numberOfAnalystOpinions") val numberOfAnalystOpinions: DataEntry,
    @SerialName("operatingCashflow") val operatingCashflow: DataEntry,
    @SerialName("operatingMargins") val operatingMargins: DataEntry,
    @SerialName("profitMargins") val profitMargins: DataEntry,
    @SerialName("quickRatio") val quickRatio: DataEntry,
    @SerialName("recommendationKey") val recommendationKey: String,
    @SerialName("recommendationMean") val recommendationMean: DataEntry,
    @SerialName("returnOnAssets") val returnOnAssets: DataEntry,
    @SerialName("returnOnEquity") val returnOnEquity: DataEntry,
    @SerialName("revenueGrowth") val revenueGrowth: DataEntry,
    @SerialName("revenuePerShare") val revenuePerShare: DataEntry,
    @SerialName("targetHighPrice") val targetHighPrice: DataEntry,
    @SerialName("targetLowPrice") val targetLowPrice: DataEntry,
    @SerialName("targetMeanPrice") val targetMeanPrice: DataEntry,
    @SerialName("targetMedianPrice") val targetMedianPrice: DataEntry,
    @SerialName("totalCash") val totalCash: DataEntry,
    @SerialName("totalCashPerShare") val totalCashPerShare: DataEntry,
    @SerialName("totalDebt") val totalDebt: DataEntry,
    @SerialName("totalRevenue") val totalRevenue: DataEntry
)

@Serializable data class FundOwnership(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("ownershipList") val ownershipList: List<Ownership>
)

@Serializable data class IncomeStatementHistory(
    @SerialName("incomeStatementHistory") val incomeStatementHistory: List<IncomeStatementHistoryItem>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable
data class IncomeStatementHistoryItem(
    @SerialName("costOfRevenue") val costOfRevenue: DataEntry,
    @SerialName("discontinuedOperations") val discontinuedOperations: DataEntry,
    @SerialName("ebit") val ebit: DataEntry,
    @SerialName("effectOfAccountingCharges") val effectOfAccountingCharges: DataEntry,
    @SerialName("endDate") val endDate: DataEntry,
    @SerialName("extraordinaryItems") val extraordinaryItems: DataEntry,
    @SerialName("grossProfit") val grossProfit: DataEntry,
    @SerialName("incomeBeforeTax") val incomeBeforeTax: DataEntry,
    @SerialName("incomeTaxExpense") val incomeTaxExpense: DataEntry,
    @SerialName("interestExpense") val interestExpense: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("minorityInterest") val minorityInterest: DataEntry,
    @SerialName("netIncome") val netIncome: DataEntry,
    @SerialName("netIncomeApplicableToCommonShares") val netIncomeApplicableToCommonShares: DataEntry,
    @SerialName("netIncomeFromContinuingOps") val netIncomeFromContinuingOps: DataEntry,
    @SerialName("nonRecurring") val nonRecurring: DataEntry,
    @SerialName("operatingIncome") val operatingIncome: DataEntry,
    @SerialName("otherItems") val otherItems: DataEntry,
    @SerialName("otherOperatingExpenses") val otherOperatingExpenses: DataEntry,
    @SerialName("researchDevelopment") val researchDevelopment: DataEntry,
    @SerialName("sellingGeneralAdministrative") val sellingGeneralAdministrative: DataEntry,
    @SerialName("totalOperatingExpenses") val totalOperatingExpenses: DataEntry,
    @SerialName("totalOtherIncomeExpenseNet") val totalOtherIncomeExpenseNet: DataEntry,
    @SerialName("totalRevenue") val totalRevenue: DataEntry
)

@Serializable data class IndexTrend(
    @SerialName("estimates") val estimates: List<Estimation>,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("peRatio") val peRatio: DataEntry,
    @SerialName("pegRatio") val pegRatio: DataEntry,
    @SerialName("symbol") val symbol: String? = null
)

@Serializable data class InsiderHolders(
    @SerialName("holders") val holders: List<Holder>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class InsiderTransactions(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("transactions") val transactions: List<Transaction>
)

@Serializable data class InstitutionOwnership(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("ownershipList") val ownershipList: List<Ownership>
)

@Serializable data class MajorDirectHolders(
    @SerialName("holders") val holders: List<String>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class MajorHoldersBreakdown(
    @SerialName("insidersPercentHeld") val insidersPercentHeld: DataEntry,
    @SerialName("institutionsCount") val institutionsCount: DataEntry,
    @SerialName("institutionsFloatPercentHeld") val institutionsFloatPercentHeld: DataEntry,
    @SerialName("institutionsPercentHeld") val institutionsPercentHeld: DataEntry,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class NetSharePurchaseActivity(
    @SerialName("buyInfoCount") val buyInfoCount: DataEntry,
    @SerialName("buyInfoShares") val buyInfoShares: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("netInfoCount") val netInfoCount: DataEntry,
    @SerialName("netInfoShares") val netInfoShares: DataEntry,
    @SerialName("netPercentInsiderShares") val netPercentInsiderShares: DataEntry,
    @SerialName("period") val period: String,
    @SerialName("sellInfoCount") val sellInfoCount: DataEntry,
    @SerialName("sellInfoShares") val sellInfoShares: DataEntry,
    @SerialName("totalInsiderShares") val totalInsiderShares: DataEntry
)

@Serializable data class Price(
    @SerialName("averageDailyVolume10Day") val averageDailyVolume10Day: DataEntry,
    @SerialName("averageDailyVolume3Month") val averageDailyVolume3Month: DataEntry,
    @SerialName("circulatingSupply") val circulatingSupply: DataEntry,
    @SerialName("currency") val currency: String,
    @SerialName("currencySymbol") val currencySymbol: String,
    @SerialName("exchange") val exchange: String,
    @SerialName("exchangeDataDelayedBy") val exchangeDataDelayedBy: Int,
    @SerialName("exchangeName") val exchangeName: String,
    @SerialName("fromCurrency") val fromCurrency: String? = null,
    @SerialName("lastMarket") val lastMarket: String? = null,
    @SerialName("longName") val longName: String,
    @SerialName("marketCap") val marketCap: DataEntry,
    @SerialName("marketState") val marketState: String,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("openInterest") val openInterest: DataEntry,
    @SerialName("postMarketChange") val postMarketChange: DataEntry,
    @SerialName("postMarketChangePercent") val postMarketChangePercent: DataEntry,
    @SerialName("postMarketPrice") val postMarketPrice: DataEntry,
    @SerialName("postMarketSource") val postMarketSource: String,
    @SerialName("postMarketTime") val postMarketTime: Int,
    @SerialName("preMarketChange") val preMarketChange: DataEntry,
    @SerialName("preMarketPrice") val preMarketPrice: DataEntry,
    @SerialName("preMarketSource") val preMarketSource: String,
    @SerialName("priceHint") val priceHint: DataEntry,
    @SerialName("quoteSourceName") val quoteSourceName: String,
    @SerialName("quoteType") val quoteType: String,
    @SerialName("regularMarketChange") val regularMarketChange: DataEntry,
    @SerialName("regularMarketChangePercent") val regularMarketChangePercent: DataEntry,
    @SerialName("regularMarketDayHigh") val regularMarketDayHigh: DataEntry,
    @SerialName("regularMarketDayLow") val regularMarketDayLow: DataEntry,
    @SerialName("regularMarketOpen") val regularMarketOpen: DataEntry,
    @SerialName("regularMarketPreviousClose") val regularMarketPreviousClose: DataEntry,
    @SerialName("regularMarketPrice") val regularMarketPrice: DataEntry,
    @SerialName("regularMarketSource") val regularMarketSource: String,
    @SerialName("regularMarketTime") val regularMarketTime: Int,
    @SerialName("regularMarketVolume") val regularMarketVolume: DataEntry,
    @SerialName("shortName") val shortName: String,
    @SerialName("strikePrice") val strikePrice: DataEntry,
    @SerialName("symbol") val symbol: String,
    @SerialName("toCurrency") val toCurrency: String? = null,
    @SerialName("underlyingSymbol") val underlyingSymbol: String? = null,
    @SerialName("volume24Hr") val volume24Hr: DataEntry,
    @SerialName("volumeAllCurrencies") val volumeAllCurrencies: DataEntry
)

@Serializable data class QuoteType(
    @SerialName("exchange") val exchange: String,
    @SerialName("firstTradeDateEpochUtc") val firstTradeDateEpochUtc: Int,
    @SerialName("gmtOffSetMilliseconds") val gmtOffSetMilliseconds: Int,
    @SerialName("longName") val longName: String,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("messageBoardId") val messageBoardId: String,
    @SerialName("quoteType") val quoteType: String,
    @SerialName("shortName") val shortName: String,
    @SerialName("symbol") val symbol: String,
    @SerialName("timeZoneFullName") val timeZoneFullName: String,
    @SerialName("timeZoneShortName") val timeZoneShortName: String,
    @SerialName("underlyingSymbol") val underlyingSymbol: String,
    @SerialName("uuid") val uuid: String
)

@Serializable data class RecommendationTrend(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("trend") val trend: List<TrendEstimation>
)

@Serializable data class SecFilings(
    @SerialName("filings") val filings: List<Filing>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable data class Estimation(
    @SerialName("growth") val growth: DataEntry,
    @SerialName("period") val period: String
)

@Serializable data class SummaryDetail(
    @SerialName("algorithm") val algorithm: String? = null,
    @SerialName("ask") val ask: DataEntry,
    @SerialName("askSize") val askSize: DataEntry,
    @SerialName("averageDailyVolume10Day") val averageDailyVolume10Day: DataEntry,
    @SerialName("averageVolume") val averageVolume: DataEntry,
    @SerialName("averageVolume10days") val averageVolume10days: DataEntry,
    @SerialName("beta") val beta: DataEntry,
    @SerialName("bid") val bid: DataEntry,
    @SerialName("bidSize") val bidSize: DataEntry,
    @SerialName("circulatingSupply") val circulatingSupply: DataEntry,
    @SerialName("currency") val currency: String,
    @SerialName("dayHigh") val dayHigh: DataEntry,
    @SerialName("dayLow") val dayLow: DataEntry,
    @SerialName("dividendRate") val dividendRate: DataEntry,
    @SerialName("dividendYield") val dividendYield: DataEntry,
    @SerialName("exDividendDate") val exDividendDate: DataEntry,
    @SerialName("expireDate") val expireDate: DataEntry,
    @SerialName("fiftyDayAverage") val fiftyDayAverage: DataEntry,
    @SerialName("fiftyTwoWeekHigh") val fiftyTwoWeekHigh: DataEntry,
    @SerialName("fiftyTwoWeekLow") val fiftyTwoWeekLow: DataEntry,
    @SerialName("fiveYearAvgDividendYield") val fiveYearAvgDividendYield: DataEntry,
    @SerialName("forwardPE") val forwardPE: DataEntry,
    @SerialName("fromCurrency") val fromCurrency: String? = null,
    @SerialName("lastMarket") val lastMarket: String? = null,
    @SerialName("marketCap") val marketCap: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("maxSupply") val maxSupply: DataEntry,
    @SerialName("navPrice") val navPrice: DataEntry,
    @SerialName("open") val `open`: DataEntry,
    @SerialName("openInterest") val openInterest: DataEntry,
    @SerialName("payoutRatio") val payoutRatio: DataEntry,
    @SerialName("previousClose") val previousClose: DataEntry,
    @SerialName("priceHint") val priceHint: DataEntry,
    @SerialName("priceToSalesTrailing12Months") val priceToSalesTrailing12Months: DataEntry,
    @SerialName("regularMarketDayHigh") val regularMarketDayHigh: DataEntry,
    @SerialName("regularMarketDayLow") val regularMarketDayLow: DataEntry,
    @SerialName("regularMarketOpen") val regularMarketOpen: DataEntry,
    @SerialName("regularMarketPreviousClose") val regularMarketPreviousClose: DataEntry,
    @SerialName("regularMarketVolume") val regularMarketVolume: DataEntry,
    @SerialName("startDate") val startDate: DataEntry,
    @SerialName("strikePrice") val strikePrice: DataEntry,
    @SerialName("toCurrency") val toCurrency: String? = null,
    @SerialName("totalAssets") val totalAssets: DataEntry,
    @SerialName("tradeable") val tradeable: Boolean,
    @SerialName("trailingAnnualDividendRate") val trailingAnnualDividendRate: DataEntry,
    @SerialName("trailingAnnualDividendYield") val trailingAnnualDividendYield: DataEntry,
    @SerialName("trailingPE") val trailingPE: DataEntry,
    @SerialName("twoHundredDayAverage") val twoHundredDayAverage: DataEntry,
    @SerialName("volume") val volume: DataEntry,
    @SerialName("volume24Hr") val volume24Hr: DataEntry,
    @SerialName("volumeAllCurrencies") val volumeAllCurrencies: DataEntry,
    @SerialName("yield") val yield: DataEntry,
    @SerialName("ytdReturn") val ytdReturn: DataEntry
)

@Serializable data class SummaryProfile(
    @SerialName("address1") val address1: String,
    @SerialName("city") val city: String,
    @SerialName("companyOfficers") val companyOfficers: List<CompanyOfficer>,
    @SerialName("country") val country: String,
    @SerialName("fullTimeEmployees") val fullTimeEmployees: Int,
    @SerialName("industry") val industry: String,
    @SerialName("longBusinessSummary") val longBusinessSummary: String,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("phone") val phone: String,
    @SerialName("sector") val sector: String,
    @SerialName("state") val state: String,
    @SerialName("website") val website: String,
    @SerialName("zip") val zip: String
)

@Serializable data class UpgradeDowngradeHistory(
    @SerialName("history") val history: List<UpgradeDowngradeHistoryItem>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable
data class UpgradeDowngradeHistoryItem(
    @SerialName("action") val action: String,
    @SerialName("epochGradeDate") val epochGradeDate: Int,
    @SerialName("firm") val firm: String,
    @SerialName("fromGrade") val fromGrade: String,
    @SerialName("toGrade") val toGrade: String
)

@Serializable data class CompanyOfficer(
    @SerialName("age") val age: Int? = null,
    @SerialName("exercisedValue") val exercisedValue: DataEntry,
    @SerialName("fiscalYear") val fiscalYear: Int? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("name") val name: String,
    @SerialName("title") val title: String,
    @SerialName("totalPay") val totalPay: DataEntry? = null,
    @SerialName("unexercisedValue") val unexercisedValue: DataEntry,
    @SerialName("yearBorn") val yearBorn: Int? = null
)


@Serializable data class BalanceSheetStatement(
    @SerialName("accountsPayable") val accountsPayable: DataEntry,
    @SerialName("cash") val cash: DataEntry,
    @SerialName("commonStock") val commonStock: DataEntry,
    @SerialName("endDate") val endDate: DataEntry,
    @SerialName("inventory") val inventory: DataEntry,
    @SerialName("longTermDebt") val longTermDebt: DataEntry,
    @SerialName("longTermInvestments") val longTermInvestments: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("netReceivables") val netReceivables: DataEntry,
    @SerialName("netTangibleAssets") val netTangibleAssets: DataEntry,
    @SerialName("otherAssets") val otherAssets: DataEntry,
    @SerialName("otherCurrentAssets") val otherCurrentAssets: DataEntry,
    @SerialName("otherCurrentLiab") val otherCurrentLiab: DataEntry,
    @SerialName("otherLiab") val otherLiab: DataEntry,
    @SerialName("otherStockholderEquity") val otherStockholderEquity: DataEntry,
    @SerialName("propertyPlantEquipment") val propertyPlantEquipment: DataEntry,
    @SerialName("retainedEarnings") val retainedEarnings: DataEntry,
    @SerialName("shortLongTermDebt") val shortLongTermDebt: DataEntry,
    @SerialName("shortTermInvestments") val shortTermInvestments: DataEntry,
    @SerialName("totalAssets") val totalAssets: DataEntry,
    @SerialName("totalCurrentAssets") val totalCurrentAssets: DataEntry,
    @SerialName("totalCurrentLiabilities") val totalCurrentLiabilities: DataEntry,
    @SerialName("totalLiab") val totalLiab: DataEntry,
    @SerialName("totalStockholderEquity") val totalStockholderEquity: DataEntry,
    @SerialName("treasuryStock") val treasuryStock: DataEntry
)

@Serializable data class Earnings(
    @SerialName("earningsAverage") val earningsAverage: DataEntry,
    @SerialName("earningsDate") val earningsDate: List<DataEntry>,
    @SerialName("earningsHigh") val earningsHigh: DataEntry,
    @SerialName("earningsLow") val earningsLow: DataEntry,
    @SerialName("revenueAverage") val revenueAverage: DataEntry,
    @SerialName("revenueHigh") val revenueHigh: DataEntry,
    @SerialName("revenueLow") val revenueLow: DataEntry
)


@Serializable data class CashflowStatement(
    @SerialName("capitalExpenditures") val capitalExpenditures: DataEntry,
    @SerialName("changeInCash") val changeInCash: DataEntry,
    @SerialName("changeToAccountReceivables") val changeToAccountReceivables: DataEntry,
    @SerialName("changeToInventory") val changeToInventory: DataEntry,
    @SerialName("changeToLiabilities") val changeToLiabilities: DataEntry,
    @SerialName("changeToNetincome") val changeToNetincome: DataEntry,
    @SerialName("changeToOperatingActivities") val changeToOperatingActivities: DataEntry,
    @SerialName("depreciation") val depreciation: DataEntry,
    @SerialName("dividendsPaid") val dividendsPaid: DataEntry,
    @SerialName("endDate") val endDate: DataEntry,
    @SerialName("investments") val investments: DataEntry,
    @SerialName("issuanceOfStock") val issuanceOfStock: DataEntry? = null,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("netBorrowings") val netBorrowings: DataEntry,
    @SerialName("netIncome") val netIncome: DataEntry,
    @SerialName("otherCashflowsFromFinancingActivities") val otherCashflowsFromFinancingActivities: DataEntry,
    @SerialName("otherCashflowsFromInvestingActivities") val otherCashflowsFromInvestingActivities: DataEntry,
    @SerialName("repurchaseOfStock") val repurchaseOfStock: DataEntry,
    @SerialName("totalCashFromFinancingActivities") val totalCashFromFinancingActivities: DataEntry,
    @SerialName("totalCashFromOperatingActivities") val totalCashFromOperatingActivities: DataEntry,
    @SerialName("totalCashflowsFromInvestingActivities") val totalCashflowsFromInvestingActivities: DataEntry
)

@Serializable data class EarningsChart(
    @SerialName("currentQuarterEstimate") val currentQuarterEstimate: DataEntry,
    @SerialName("currentQuarterEstimateDate") val currentQuarterEstimateDate: String,
    @SerialName("currentQuarterEstimateYear") val currentQuarterEstimateYear: Int,
    @SerialName("earningsDate") val earningsDate: List<DataEntry>,
    @SerialName("quarterly") val quarterly: List<Quarterly>
)

@Serializable data class FinancialsChart(
    @SerialName("quarterly") val quarterly: List<Quarterly>,
    @SerialName("yearly") val yearly: List<Yearly>
)

@Serializable data class Quarterly(
    @SerialName("actual") val `actual`: DataEntry? = null,
    @SerialName("date") val date: String,
    @SerialName("estimate") val estimate: DataEntry? = null,
    @SerialName("revenue") val revenue: DataEntry? = null,
    @SerialName("earnings") val earnings: DataEntry? = null,
)

@Serializable data class Yearly(
    @SerialName("date") val date: Int,
    @SerialName("earnings") val earnings: DataEntry,
    @SerialName("revenue") val revenue: DataEntry
)

@Serializable data class History(
    @SerialName("epsActual") val epsActual: DataEntry,
    @SerialName("epsDifference") val epsDifference: DataEntry,
    @SerialName("epsEstimate") val epsEstimate: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("period") val period: String,
    @SerialName("quarter") val quarter: DataEntry,
    @SerialName("surprisePercent") val surprisePercent: DataEntry
)

@Serializable data class Trend(
    @SerialName("earningsEstimate") val earningsEstimate: EarningsEstimate,
    @SerialName("endDate") val endDate: String?,
    @SerialName("epsRevisions") val epsRevisions: EpsRevisions,
    @SerialName("epsTrend") val epsTrend: EpsTrend,
    @SerialName("growth") val growth: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("period") val period: String,
    @SerialName("revenueEstimate") val revenueEstimate: RevenueEstimate
)

@Serializable data class TrendEstimation(
    @SerialName("buy") val buy: Int,
    @SerialName("hold") val hold: Int,
    @SerialName("period") val period: String,
    @SerialName("sell") val sell: Int,
    @SerialName("strongBuy") val strongBuy: Int,
    @SerialName("strongSell") val strongSell: Int
)

@Serializable data class EarningsEstimate(
    @SerialName("avg") val avg: DataEntry,
    @SerialName("growth") val growth: DataEntry,
    @SerialName("high") val high: DataEntry,
    @SerialName("low") val low: DataEntry,
    @SerialName("numberOfAnalysts") val numberOfAnalysts: DataEntry,
    @SerialName("yearAgoEps") val yearAgoEps: DataEntry
)

@Serializable data class EpsRevisions(
    @SerialName("downLast30days") val downLast30days: DataEntry,
    @SerialName("downLast90days") val downLast90days: DataEntry,
    @SerialName("upLast30days") val upLast30days: DataEntry,
    @SerialName("upLast7days") val upLast7days: DataEntry
)

@Serializable data class EpsTrend(
    @SerialName("current") val current: DataEntry,
    @SerialName("7daysAgo") val daysAgo7: DataEntry,
    @SerialName("30daysAgo") val daysAgo30: DataEntry,
    @SerialName("60daysAgo") val daysAgo60: DataEntry,
    @SerialName("90daysAgo") val daysAgo90: DataEntry
)


@Serializable data class RevenueEstimate(
    @SerialName("avg") val avg: DataEntry,
    @SerialName("growth") val growth: DataEntry,
    @SerialName("high") val high: DataEntry,
    @SerialName("low") val low: DataEntry,
    @SerialName("numberOfAnalysts") val numberOfAnalysts: DataEntry,
    @SerialName("yearAgoRevenue") val yearAgoRevenue: DataEntry
)

@Serializable data class Ownership(
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("organization") val organization: String,
    @SerialName("pctHeld") val pctHeld: DataEntry,
    @SerialName("position") val position: DataEntry,
    @SerialName("reportDate") val reportDate: DataEntry,
    @SerialName("value") val value: DataEntry
)

@Serializable data class Holder(
    @SerialName("latestTransDate") val latestTransDate: DataEntry,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("name") val name: String,
    @SerialName("positionDirect") val positionDirect: DataEntry? = null,
    @SerialName("positionDirectDate") val positionDirectDate: DataEntry? = null,
    @SerialName("positionIndirect") val positionIndirect: DataEntry? = null,
    @SerialName("positionIndirectDate") val positionIndirectDate: DataEntry? = null,
    @SerialName("relation") val relation: String,
    @SerialName("transactionDescription") val transactionDescription: String,
    @SerialName("url") val url: String
)

@Serializable data class DataEntry(
    @SerialName("fmt") val formatted: String? = null,
    @SerialName("longFmt") val longFormatted: String? = null,
    @SerialName("raw") val raw: Double? = null
)

@Serializable data class Transaction(
    @SerialName("filerName") val filerName: String,
    @SerialName("filerRelation") val filerRelation: String,
    @SerialName("filerUrl") val filerUrl: String,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("moneyText") val moneyText: String,
    @SerialName("ownership") val ownership: String,
    @SerialName("shares") val shares: DataEntry,
    @SerialName("startDate") val startDate: DataEntry,
    @SerialName("transactionText") val transactionText: String,
    @SerialName("value") val value: DataEntry? = null
)

@Serializable data class Filing(
    @SerialName("date") val date: String,
    @SerialName("edgarUrl") val edgarUrl: String,
    @SerialName("epochDate") val epochDate: Int,
    @SerialName("maxAge") val maxAge: Int,
    @SerialName("title") val title: String,
    @SerialName("type") val type: String
)
