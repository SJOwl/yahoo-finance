package vorobeij.yfinance.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QuoteSummaryResponse(
    @SerialName("quoteSummary") val quoteSummary: QuoteSummary
)

@Serializable
data class QuoteSummary(
    @SerialName("error") val error: String? = null,
    @SerialName("result") val result: List<Result>
)

@Serializable
data class Result(
    @SerialName("incomeStatementHistoryQuarterly") val incomeStatementHistoryQuarterly: IncomeStatementHistoryQuarterly
)

@Serializable
data class IncomeStatementHistoryQuarterly(
    @SerialName("incomeStatementHistory") val incomeStatementHistory: List<IncomeStatementHistory>,
    @SerialName("maxAge") val maxAge: Int
)

@Serializable
data class IncomeStatementHistory(
    @SerialName("costOfRevenue") val costOfRevenue: DataEntry,
    @SerialName("discontinuedOperations") val discontinuedOperations: DataEntry,
    @SerialName("ebit") val ebit: DataEntry,
    @SerialName("effectOfAccountingCharges") val effectOfAccountingCharges: DataEntry,
    @SerialName("endDate") val endDate: EndDate,
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

@Serializable
data class DataEntry(
    @SerialName("fmt") val formatted: String? = null,
    @SerialName("longFmt") val longFormatted: String? = null,
    @SerialName("raw") val raw: Long? = null
)

@Serializable
data class EndDate(
    @SerialName("fmt") val formatted: String,
    @SerialName("raw") val raw: Int
)
