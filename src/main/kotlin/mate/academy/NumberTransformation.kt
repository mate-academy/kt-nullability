package mate.academy

private const val MULTIPLIER = 3
private const val ADDITION = 10
private const val DIVISOR = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLIER)?.plus(ADDITION)?.rem(DIVISOR)
}
