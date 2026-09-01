package mate.academy

const val MULTIPLIER = 3
const val ADDITION = 10
const val REMAINDER = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()
        ?.times(MULTIPLIER)
        ?.plus(ADDITION)
        ?.rem(REMAINDER)
}
