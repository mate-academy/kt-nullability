package mate.academy

const val MULTIPLIER = 3
const val INCREMENT = 10
const val DIVISOR = 11


fun getReminder(numberStr: String?) : Int? {

    return numberStr?.toIntOrNull()?.let {
        (it * MULTIPLIER + INCREMENT) % DIVISOR
    }
}
