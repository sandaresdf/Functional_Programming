package Tute1

object Q04 {

  val coverPriceOfBook: Double = 24.95;
  val discount: Double = 0.4;
  val shippingFirst50: Double = 3.0;
  val shippingMore50: Double = 0.75;

  def totalShippingCost(qty: Int): Double = if (qty <= 50) {
    qty * shippingFirst50;
  } else {
    50 * shippingFirst50 + (qty - 50) * shippingMore50;
  }

  def discountedPrice(): Double = coverPriceOfBook * (1-discount);

  def totalPrice(qty: Int): Double = discountedPrice() * qty;

  def wholeSaleCost(qty: Int): Double = totalPrice(qty) + totalShippingCost(qty);


  def main(args: Array[String]) = {
    println(wholeSaleCost(60));
  }

}
