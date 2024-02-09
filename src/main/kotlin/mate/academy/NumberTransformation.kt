package mate.academy

const val THREE = 3
const val TEN = 10
const val ELEVEN = 11

fun getReminder(numberStr: String?) : Int? {
    val intValue : Int? = numberStr?.toInt()
    return intValue?.times(THREE)?.plus(TEN)?.rem(ELEVEN)
}
