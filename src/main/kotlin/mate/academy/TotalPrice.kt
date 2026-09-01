package mate.academy

private const val DEFAULT_PRICE_PER_PRODUCT = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    val result = pricePerProduct?: DEFAULT_PRICE_PER_PRODUCT
    return result * count
}
