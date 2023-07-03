package Tute1

object Q05 {

  def easyRun(len: Int): Int = len * 8;

  def tempoRun(len: Int): Int = len * 7;

  def main(args: Array[String]) = {
    val time = easyRun(2) + tempoRun(3) + easyRun(2);
    println(time);
  }

}
