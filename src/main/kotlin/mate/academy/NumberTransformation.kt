package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLIER)?.plus(ITEM)?.rem(DIVIDER)
}

const val MULTIPLIER = 3
const val ITEM = 10
const val DIVIDER = 11
