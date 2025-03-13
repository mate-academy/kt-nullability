package mate.academy

const val DEFAULT_PRICE = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    return pricePerProduct?.times(count) ?: (DEFAULT_PRICE * count)
}
