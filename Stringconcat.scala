package Potri

/*
Create a new string which is 4 copies of the 2 front characters of a given string.
If the given string length is less than 2 return the original string.
Input  Given string = “India”
Expected Output  In, In, In, In  InInInIn
 */
object Stringconcat extends App {

  def test(str : String, l :Int ):String={
  if (l < 2) {
    print(s"string is small($l): ")
     string1
  } else {
    val string2 = string1.substring(0, 2)
    print("Concatenated String:")
     string2 + string2 + string2 + string2
  }
  }
  println("Enter the String : ")
  val string1 = scala.io.StdIn.readLine()
  val len = string1.length
  println(test(string1,len))
}
