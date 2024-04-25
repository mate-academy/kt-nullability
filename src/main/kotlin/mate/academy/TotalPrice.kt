package mate.academy

fun calculateTotalPrice(pricePerProduct: Double?, count: Int): Double {
    val price = pricePerProduct ?: 29.99
    return price * count
}
