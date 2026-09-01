package mate.academy

private const val NUMBER_THREE = 3
private const val NUMBER_TEN = 10
private const val NUMBER_ELEVEN = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.let {
        (it * NUMBER_THREE + NUMBER_TEN) % NUMBER_ELEVEN }
    }
