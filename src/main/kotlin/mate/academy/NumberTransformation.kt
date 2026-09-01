package mate.academy

const val MULTI: Int = 3
const val PLUS: Int = 10
const val REM: Int = 11

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toInt()?.times(MULTI)?.plus(PLUS)?.rem(REM)
}
