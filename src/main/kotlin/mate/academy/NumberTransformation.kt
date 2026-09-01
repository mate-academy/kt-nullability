package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULTIPLICATION_NUM = 3
const val ADDITION_NUM = 10
const val DIVISION_NUM = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLICATION_NUM)
        ?.plus(ADDITION_NUM)?.rem(DIVISION_NUM)
}
