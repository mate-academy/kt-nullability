package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULTIPLY_NUM = 3
const val SUM_NUM = 10
const val MOD_NUM = 11


fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLY_NUM)?.plus(SUM_NUM)?.mod(MOD_NUM)
}
