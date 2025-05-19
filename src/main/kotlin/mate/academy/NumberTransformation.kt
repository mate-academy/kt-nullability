package mate.academy

const val FIRSTNUMBER = 3
const val SECONDNUMBERS = 10
const val THIRDNUMBER = 11
/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?) : Int? {
    return if (numberStr != null) (numberStr.toInt() * FIRSTNUMBER + SECONDNUMBERS) % THIRDNUMBER else null
}
