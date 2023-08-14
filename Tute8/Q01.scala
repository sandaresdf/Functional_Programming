package Tute8

object Q01 {
  def calcInterest: Double => Double = {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
    val deposit1 = 15000.0
    val deposit2 = 100000.0
    val deposit3 = 500000.0
    val deposit4 = 2500000.0

    println("Interest for deposit of Rs. " + calcInterest(deposit1))
    println("Interest for deposit of Rs. " + calcInterest(deposit2))
    println("Interest for deposit of Rs. " + calcInterest(deposit3))
    println("Interest for deposit of Rs. " + calcInterest(deposit4))
  }
}
