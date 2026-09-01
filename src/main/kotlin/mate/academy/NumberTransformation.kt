package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

private const val MULTIPLY_NUM = 3
private const val ADD_NUM = 10
private const val REMINDER_NUM = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLY_NUM)?.plus(ADD_NUM)?.rem(REMINDER_NUM)
}
