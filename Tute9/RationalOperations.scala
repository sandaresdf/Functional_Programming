package Tute9

class RationalOperations(numerator: Int, denominator: Int)
{
  require(denominator != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(numerator.abs, denominator.abs)
  val numer: Int = numerator / gcdValue
  val denom: Int = denominator / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: RationalOperations = new RationalOperations(-numer, denom)

  def sub(that: RationalOperations): RationalOperations = {
    new RationalOperations(numer * that.denom - that.numer * denom, denom * that.denom)
  }

  override def toString: String = s"$numer/$denom"
}

object RationalOpObj extends App {
  val rational1 = new RationalOperations(3, 4)
  val rational2 = new RationalOperations(5, 8)
  val rational3 = new RationalOperations(2, 7)

  val result = rational1.sub(rational2).sub(rational3)
  println(s"Result: $result")
}