package InClass

import java.lang.Math._

object Area {

  def areaOfCircle(r: Double): Double = Math.PI * r * r

  def areaOfRec(w: Double, l: Double): Double = w * l

  def areaOfCilinder(r: Double, h: Double): Double = 2 * areaOfCircle(r) + areaOfRec(2*Math.PI*r, h)

  def main(args: Array[String]): Unit = {
    println(areaOfCilinder(3, 6))
  }

}
