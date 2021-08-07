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
  val diff1 = 100 - number1
  val diff2 = 100 - number2
  if(number1 == number2)
    println("Both number are equal ")
  else if (diff1<0 && diff2>0)    // if number1 is greater than 100
    println(s"$number2 is close to 100")
  else if (diff2<0 && diff1>0)    // if number2 is greater than 100
    println(s"$number1 is close to 100")
  else if(diff2<0 && diff1<0)   // if both number1 and number 2 are greater than 100
    {
      if(diff1 > diff2)
        println(s"$number1 is close to 100")
      else
        println(s"$number2 is close to 100")
    }
  else if(diff1<diff2)     // if both number1 and number 2 are less than 100
    println(s"$number1 is close to 100")
  else
    println(s"$number2 is close to 100")


}
