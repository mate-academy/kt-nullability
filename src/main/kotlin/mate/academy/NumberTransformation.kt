package mate.academy
const val TREE = 3
const val TEN = 10
const val ELLEV = 11
fun getReminder(numberStr: String?) : Int? {
        return numberStr?.toInt()?.times(TREE)?.plus(TEN)?.rem(ELLEV)
}
