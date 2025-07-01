package mate.academy
const val BASIC_NUM_ONE = 3
const val BASIC_NUM_TWO = 10
const val BASIC_NUM_THREE = 11

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?) : Int? {
    val number = numberStr?.toIntOrNull() ?: return null
    return (number * BASIC_NUM_ONE + BASIC_NUM_TWO) % BASIC_NUM_THREE
}
