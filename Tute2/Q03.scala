package Tute2

object Q03 {

  val taxPercentage: Double = 0.12
  val normalHourPay: Double = 250.00
  val OTHourPay: Double = 85.00

  def payableTax(totalIncome: Double): Double = totalIncome * taxPercentage

  def OTHoursIncome(noOfHours: Double): Double = noOfHours * OTHourPay

  def normalHoursIncome(noOfHours: Double): Double = noOfHours * normalHourPay

  def takeHomeSalary(normalHours: Double, OTHours: Double): Double = {
    val totalSalary = normalHoursIncome(normalHours) + OTHoursIncome(OTHours)
    totalSalary - payableTax(totalSalary)
  }

  def main(args: Array[String]) = {
    var normalHours: Double = 40;
    var OTHours: Double = 30;

    println("Salary for the week is: " + takeHomeSalary(normalHours, OTHours))
  }
}
