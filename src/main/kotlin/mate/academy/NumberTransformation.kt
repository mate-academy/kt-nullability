package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val NUMBER_OF_TOOLS = 3
const val NUMBER_TO_PLUS = 10
const val NUMBER_TO_DIVIDED = 11

fun getReminder(numberStr: String?) : Int? {
    return if (!numberStr.isNullOrEmpty()) {
        val number = numberStr.toInt()
        (number * NUMBER_OF_TOOLS + NUMBER_TO_PLUS) % NUMBER_TO_DIVIDED
    } else {
        null
    }
}
