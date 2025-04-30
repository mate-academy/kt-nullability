package mate.academy
const val PRODUCT_PRICE = 29.99
/*
    Calculate the products total price based on the provide price per product and products amount.
    If the price is not provided, use default price per product equal to 29.99
 */
fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    return count.times(pricePerProduct?: PRODUCT_PRICE)
}
