package exercises

object FunctionTest extends App
{

  def greetFunction(a: String, b: Int): Unit =
    println("Hi, my name is " + a + " and I am " + b + " years old")
  greetFunction("Anson", 36)

  //Printing the product of numbers so if 3 is entered it will be 1*2*3
  def factFunction(a: Int): Int = {
    if (a <= 0) 1
    else a * factFunction(a-1)
  }
  println(factFunction(4))

  //Printing the current fibanachi
  def fibanachi(i: Int): Int = {
    if (i <= 2) 1
    else fibanachi(i-1) + fibanachi(i-2)
  }
  println(fibanachi(3))
}
