package Potri
/*
Check which number is nearest to the value 100 among two given integers.
 Return 0 if the two numbers are equal.
 test cases
  1) 99, 1000     - 99
  2) 10000,91     - 91
  3) 10,78        - 78
  4) 10000,76767  - 10000
  5)0, 23421      - 0
 */
object Check_number extends App{
  println("Enter number 1 and number 2 : ")
  val number1 =scala.io.StdIn.readInt()
  val number2 =scala.io.StdIn.readInt()
  println("The closest number to 100 :" +test(number1,number2))

  def test(x: Int, y: Int) = {
    val n = 100
    val val1 = scala.math.abs(x - n)
    val val2 = scala.math.abs(y - n)
    if (val1 == val2) 0
    else if (val1 < val2) x
    else y
  }

}
