package Tute9

class Rational(numerator: Int, denominator: Int)
{
  // check whether the denomitor is 0
  require(denominator != 0, "Denominator cannot be zero")

  // calculate the GCD of given number
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val gcdValue: Int = gcd(numerator.abs, denominator.abs)
  val numer: Int = numerator / gcdValue
  val denom: Int = denominator / gcdValue
  def neg: Rational = new Rational(-numer, denom)
  override def toString: String = s"$numer/$denom"
}

object RationalObj extends App {
  val rational1 = new Rational(2, 3)
  println(s"Rational 1: $rational1")

  val negRational1 = rational1.neg
  println(s"Negation of Rational 1: $negRational1")
}
