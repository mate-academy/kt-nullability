package mate.academy

const val BASE_PRICE: Double = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int): Double {
    return pricePerProduct?.times(count) ?: BASE_PRICE.times(count)
}
