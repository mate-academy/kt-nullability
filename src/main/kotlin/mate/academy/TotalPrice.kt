package mate.academy


private const val DEFAULT_PRICE_PER_PRODUCT = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    return pricePerProduct?.times(count) ?: (DEFAULT_PRICE_PER_PRODUCT * count)
}
