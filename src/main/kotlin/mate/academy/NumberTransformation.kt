package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

const val MULTIPLY = 3
const val ADD = 10
const val REMINDER = 11
fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toIntOrNull()?.times(MULTIPLY)?.plus(ADD)?.rem(REMINDER)
}
