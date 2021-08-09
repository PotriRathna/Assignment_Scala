package Potri
/*
: Write a Scala program to check whether a specified character is happy or not.
 A character is happy when the same character appears to its left or right in a string.
Input  Choose a number and specify that as a happy character
Expected Output  Do the factorial to reach that number,
if the number is achieved factorially, return “happy”, else return “not happy”

 */
object Happyornot extends App{

  println("Enter the String : ")
  val string1 = scala.io.StdIn.readLine()
  println(s"$string1 is " +fact(string1,0))
  def fact(str:String,c:Int):String=
    {
      val len = string1.length
      if(str.charAt(c)==str.charAt(c+1)) "Happy"
      else
        {
          if(c<len-2) fact(str,c+1)
          else "unhappy"
        }
      }
}
