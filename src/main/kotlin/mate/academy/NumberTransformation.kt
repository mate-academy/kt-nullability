package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
private const val MULTIPLIER = 3

private const val ADD_VALUER = 10

private const val DIVIDER = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toIntOrNull()?.times(MULTIPLIER)?.plus(ADD_VALUER)?.rem(DIVIDER)
}
