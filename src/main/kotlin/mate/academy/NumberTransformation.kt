package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULT = 3
const val PLUS = 10
const val REM = 11

fun getReminder(numberStr: String?) : Int? {
    if (numberStr != null) {
        val number: Int = numberStr.filter { it.isDigit() }.toInt()
        val value = if (numberStr.contains("[0-9]".toRegex())) number.times(MULT).plus(PLUS).rem(REM) else null
        return value
    } else {
        return null
    }
}
