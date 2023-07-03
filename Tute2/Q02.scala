package Tute2

object Q02 {

  var (a: Int, b: Int, c: Int, d: Int) = (2, 3, 4, 5);
  var k: Float = 4.3f;

  def problem1(): Int = {
    // println(--b * a +c * d--);
    b-=1
    var res = b * a + c * d
    d-=1
    res
  }

  def problem2(): Int = {
    // println(a++);
    var res = a
    a+=1
    res
  }

  def problem3(): Float = {
    // println(–2 * (g–k) +c);
    -2 * (d - k) + c
  }

  def problem4(): Int = {
    // println(c=c++);
    var res = c
    c+=1
    res
  }

  def problem5(): Int = {
    // println(c=++c*a++);
    c+=1
    var res = c * a
    a+=1
    res
  }

  def main(args: Array[String]): Unit = {

    println("--b * a +c * d-- : " + problem1())
    println("a++: " + problem2())
    println("–2 * (g–k) +c : " + problem3())
    println("c=c++ : " + problem4())
    println("c=++c*a++ :" + problem5())

    println(println ("(–2)*(d–k)+c = " + (-2 * (d-k) + c)))

  }
}