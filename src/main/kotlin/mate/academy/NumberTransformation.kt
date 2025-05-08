package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

private const val MULTIPLIER = 3

private const val ADDITION = 10

private const val DIVIDER = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLIER)?.plus(ADDITION)?.rem(DIVIDER)
}
