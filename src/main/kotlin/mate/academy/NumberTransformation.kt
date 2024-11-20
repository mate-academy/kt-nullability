package mate.academy
const val MULTIPLY_NUMBER = 3
const val NUMBER_TO_ADD = 10
const val DIVIDING_NUMBER = 11
/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toIntOrNull()?.let { number ->
        (number * MULTIPLY_NUMBER + NUMBER_TO_ADD) % DIVIDING_NUMBER
    }
}
