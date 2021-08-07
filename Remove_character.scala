package Potri
/*
Remove the character in a given position of a given string. The given position will be in the range 0...string length -1 inclusive.
Input  Given String = “Scala”
Expected Outputs  Sala, cala, Scal
*/

object Remove_character extends App {

        println("Enter the String : ")
        val string1 = scala.io.StdIn.readLine()
        val len = string1.length
        println(s"String Length: $len \nEnter the position to remove character :")
        val position = +scala.io.StdIn.readInt()

        if(position<=0 || position >len ) {
            println("Invalid")
            sys.exit()
        }
        else {
            println(s"The new string : ${string1.substring(0, position-1) + string1.substring(position, len)}")
        }

}
