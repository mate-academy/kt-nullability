package mate.academy

/*
    Calculate the products total price based on the provide price per product and products amount.
    If the price is not provided, use default price per product equal to 29.99
 */
const val DEFAULT_PRICE_PER_PRODUCT : Double = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    return pricePerProduct?.times(count) ?:  DEFAULT_PRICE_PER_PRODUCT.times(count);
}
