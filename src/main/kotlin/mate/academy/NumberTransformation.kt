package mate.academy

const val MULTIPLIER = 3
const val ADDITIONAL_CONSTANT = 10
const val MODULO_DIVISOR = 11

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLIER)?.plus(ADDITIONAL_CONSTANT)?.rem(MODULO_DIVISOR)
}
