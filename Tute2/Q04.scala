package Tute2

object Q04 {
  val performanceCost: Double = 500.00
  val perPersonCost: Double = 3.00

  def calculateProfit(ticketPrice: Double): Double = {
    // Calculate the attendance from ticket price
    val attendance = 120 + ((15 - ticketPrice) / 5) * 20

    // calculate profit
    // revenue = attendance * ticketPrice
    // total cost = performanceCost + attendance * perPersonCost
    // profit = revenue - total cost
    val profit = (attendance * ticketPrice) - (performanceCost + attendance * perPersonCost)
    profit
  }

  def checkTicketPriceDecrease(ticketPrice: Int): Double =
    if (calculateProfit(ticketPrice) < calculateProfit(ticketPrice - 1))
      findBestTicketPrice(ticketPrice - 1)
    else
      ticketPrice

  def checkTicketPriceIncrease(ticketPrice: Int): Double =
    if (calculateProfit(ticketPrice) < calculateProfit(ticketPrice + 1))
      findBestTicketPrice(ticketPrice + 1)
    else
      ticketPrice

  def findBestTicketPrice(avgBestTicketPrice: Int): Double = {
    val checkedIncreasePrice: Double = checkTicketPriceIncrease(avgBestTicketPrice)
    val checkedDecreasePrice: Double = checkTicketPriceDecrease(avgBestTicketPrice)

    if (calculateProfit(checkedIncreasePrice) < calculateProfit(checkedDecreasePrice))
      checkedDecreasePrice
    else
      checkedIncreasePrice
  }

  def main(args: Array[String]): Unit = {
    var avgBestTicketPrice: Int = 15
    println("The best ticket price for maximum profit is Rs. %f".format(findBestTicketPrice(avgBestTicketPrice)))
  }
}
