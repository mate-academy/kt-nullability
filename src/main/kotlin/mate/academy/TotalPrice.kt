package mate.academy

private const val DEFAULT_PRICE_PER_PRODUCT = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int): Double {
    val price = pricePerProduct ?: DEFAULT_PRICE_PER_PRODUCT
    val result: Double = price * count
    return result
}
