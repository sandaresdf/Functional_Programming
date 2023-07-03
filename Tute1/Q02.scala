package Tute1

object Q02 {

  def convertTemperature(temp_c: Double): Double = temp_c * 1.8000 + 32.00;

  def main(args: Array[String]) = {
    println(convertTemperature(35));
  }
}
