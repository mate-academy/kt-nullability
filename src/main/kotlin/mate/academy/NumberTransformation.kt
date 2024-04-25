package mate.academy

fun getReminder(numberStr: String?): Int? {
    return numberStr?.toIntOrNull()?.let {
        (it * 3 + 10) % 11
    }
}
