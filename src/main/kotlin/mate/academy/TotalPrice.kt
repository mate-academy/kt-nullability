package mate.academy

const val DEFAULT_PRICE = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    return count.times(pricePerProduct ?: DEFAULT_PRICE)
}
