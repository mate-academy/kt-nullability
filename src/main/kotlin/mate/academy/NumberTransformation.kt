package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULTIPLY_VALUE = 3
const val ADD_VALUE = 10
const val DIVIDING_VALUE = 11
fun getReminder(numberStr: String?) : Int? {
    return if(numberStr?.isNotEmpty() == true) numberStr.toInt().times(MULTIPLY_VALUE).plus(ADD_VALUE).rem(
        DIVIDING_VALUE) else null
}
