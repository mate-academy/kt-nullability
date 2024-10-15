package mate.academy
const val TIMES = 3
const val PLUS = 10
const val REM = 11

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

/*
    Реализуйте функцию. Входная строка может содержать число или быть нулевой.
    Если число присутствует, умножьте его на 3, затем добавьте 10 и верните остаток от деления на 11.
    Если число отсутствует, верните нуль
 */

fun getReminder(numberStr: String?) : Int? {
    return if (numberStr != "") numberStr?.toInt()?.times(TIMES)?.plus(PLUS)?.rem(REM) else null
}
