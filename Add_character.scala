package Potri
/*
Create a new string with the last char added at the front and back of a given string of length 1 or more.
Input  Given String = “Scala”
Expected Outputs  aScalaa

 */

object Add_character extends App{

  println("Enter the String : ")
  val string1 = scala.io.StdIn.readLine()
  val len = string1.length
  if(len<=0) {
    println("Invalid")
    sys.exit()
  }
  else {
    val char : Char = string1.charAt(len-1)
    println(s"The new string : ${char+string1+char}")
  }

}
