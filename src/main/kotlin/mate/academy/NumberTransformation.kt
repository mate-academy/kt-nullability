package mate.academy

const val MULTIPLIER = 3
const val ADDEND = 10
const val DIVISOR = 11

fun getReminder(numberStr: String?) : Int? {
    if (numberStr == null) return null
    val potentialNumber = numberStr.filter { c -> c.isDigit() }.toInt()
    return potentialNumber.times(MULTIPLIER).plus(ADDEND).rem(DIVISOR)
}
