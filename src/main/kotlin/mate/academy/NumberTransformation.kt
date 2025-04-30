package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

const val TIMES = 3
const val PLUS = 10
const val DIV = 11
fun getReminder(numberStr: String?) : Int? {
   val result = numberStr?.toIntOrNull()?.times(TIMES)?.plus(PLUS)?.rem(DIV)
   return result
}
