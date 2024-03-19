package mate.academy

const val MULTIPLY = 3
const val ADD = 10
const val DIV = 11

fun getReminder(numberStr: String?) : Int? {
    return numberStr?.toInt()?.times(MULTIPLY)?.plus(ADD)?.rem(DIV)
}
