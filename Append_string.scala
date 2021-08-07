package Potri
/*
: Create a new string where 'if' is added to the front of a given string. If the string already begins with 'if',
return the string unchanged.
Input  Given String = Take any string with “If” and without “If”
Expected Output  String not starting with “If” add “If”, starting with “If”, not add “If”

 */
object Append_string extends App{

  println("Enter the String : ")
  val string1 = scala.io.StdIn.readLine()
   if(string1.charAt(0)=='i' && string1.charAt(1)== 'f')
      println(string1)
   else
     println("if"+string1)
}
