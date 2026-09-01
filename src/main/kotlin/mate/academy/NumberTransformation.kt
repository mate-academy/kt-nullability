package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULTIPLY_NUM = 3
const val ADDING_NUM = 10
const val REMINDER_NUM = 11
fun getReminder(numberStr: String?): Int? {
    val number: Int? = numberStr?.toInt()
    return number?.times(MULTIPLY_NUM)?.plus(ADDING_NUM)?.rem(other = REMINDER_NUM)
}


