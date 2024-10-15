package mate.academy
const val DEFAULT_PRICE = 29.99

/*
    Calculate the products total price based on the provide price per product and products amount.
    If the price is not provided, use default price per product equal to 29.99
 */

/*
    Рассчитайте общую стоимость товаров на основе предоставленной цены за товар и количества товаров.
    Если цена не указана, используйте цену за товар по умолчанию, равную 29,99
 */

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    return pricePerProduct?.times(count) ?: DEFAULT_PRICE.times(count)
}
