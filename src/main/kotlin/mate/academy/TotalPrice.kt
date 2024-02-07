package mate.academy

const val DEFAULT_PRICE_PER_PRODUCT = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int): Double {
    val price = pricePerProduct ?: DEFAULT_PRICE_PER_PRODUCT
    return price * count
}
