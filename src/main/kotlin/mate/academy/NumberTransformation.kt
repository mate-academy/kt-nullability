package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

const val MULTIPLIER = 3
const val PLUS = 10
const val REMINDER = 11

fun getReminder(numberStr: String?) : Int? {
    val number = numberStr?.toInt()
    val result = number?.times(MULTIPLIER)?.plus(PLUS)?.rem(REMINDER)
    return result
}
