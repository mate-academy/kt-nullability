package mate.academy

private const val THREE = 3

private const val TEN = 10

private const val ELEVEN = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(THREE)?.plus(TEN)?.rem(ELEVEN)
}
