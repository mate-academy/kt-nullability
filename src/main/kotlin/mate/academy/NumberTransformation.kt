package mate.academy

import java.math.BigDecimal

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MUL = 3;
const val ADD = 10;
const val REM = 11;

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toInt()?.times(MUL)?.plus(ADD)?.rem(REM)
}
