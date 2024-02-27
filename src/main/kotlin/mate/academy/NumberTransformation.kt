package mate.academy

private const val MULTIPLIER = 3
private const val ADDITION = 10
private const val MODULUS = 11

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toIntOrNull()?.let { number ->
        (number * MULTIPLIER + ADDITION) % MODULUS
    }
}
