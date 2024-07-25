package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULT_VALUE = 3
const val ADD_VALUE = 10
const val REM_DIV_VAlUE = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.filter { c -> c.isDigit() }?.toIntOrNull()?.times(MULT_VALUE)
        ?.plus(ADD_VALUE)?.rem(REM_DIV_VAlUE)
}
