package mate.academy
const val PRICE = 29.99
fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    var index = pricePerProduct?: PRICE
    return index.times(count)
}
