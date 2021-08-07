package Potri
/*
Check whether two given integers are in the range x <= 20 to y >= 50 or y <= 20 to x >= 50,
return true if the given numbers are within the range, or if the numbers are out of range return false
Test cases:
x,y - 10,70  = true
x,y - 34, 10 = false
x,y - 9, 20  = false
X,Y - 96,5   = true
X,Y - 51,21  = false
 */
object Range_check extends App{

  println("Enter value for X and Y : ")
  val x =scala.io.StdIn.readInt()
  val y =scala.io.StdIn.readInt()
  if((x<=20 && y>=50)||(y<=20 && x>=50))
    println(s"$x,$y : True")
  else
    println(s"$x,$y: False")

}
