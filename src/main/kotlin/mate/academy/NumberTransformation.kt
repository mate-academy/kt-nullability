package mate.academy

const val THREE = 3
const val TEN = 10
const val ELEVEN = 11

fun getReminder(numberStr: String?): Int? {
    if (numberStr.isNullOrEmpty()) {
        return null
    }

    return try {
        val number = numberStr.toInt()
        (number * THREE + TEN) % ELEVEN
    } catch (e: NumberFormatException) {
        null
    }
}
