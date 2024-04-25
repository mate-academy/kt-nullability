package mate.academy

const val MULTIPLIER = 3
const val ADDEND = 10
const val MODULUS = 11

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toIntOrNull()?.let {
        (it * MULTIPLIER + ADDEND) % MODULUS
    }
}
