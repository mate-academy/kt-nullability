package mate.academy

const val DEFAULT_MULTIPLIER = 3
const val DEFAULT_ADDITION = 10
const val DEFAULT_DIVISOR = 11
/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toIntOrNull()?.let { (it * DEFAULT_MULTIPLIER + DEFAULT_ADDITION) % DEFAULT_DIVISOR }
}
