package Tute10

object Q01 {

  def calculateAverage(inputs: List[Int]): Int = {
    val toFahrVals = inputs.map(celsius => (celsius * 9 / 5) + 32)
    val sumFahr = toFahrVals.reduce((a, b) => a + b)
    val avgFahr = sumFahr / toFahrVals.length
    avgFahr
  }

  def main(args: Array[String]): Unit = {

    val temperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }

}
