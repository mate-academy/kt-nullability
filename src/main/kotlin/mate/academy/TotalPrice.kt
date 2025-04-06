package mate.academy
const val defaultPrice = 29.99
fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    val price = pricePerProduct?: defaultPrice
    return price * count
}
