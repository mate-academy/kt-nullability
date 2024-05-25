package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

const val TREE = 3
const val TEN = 10
const val ELEVEN= 11

fun getReminder(numberStr: String?): Int? {
    val result : Double? = if (numberStr != null) (numberStr.toDouble() * TREE + TEN) % ELEVEN else null
    return result?.toInt()
}
