package mate.academy

const val DEFAULT_PRICE = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int): Double {
    val price = pricePerProduct ?: DEFAULT_PRICE
    return price * count
}
