package org.knoldus.CalculatorImpl

object runCalculator {
  def main(args: Array[String]): Unit = {
    val calculate = new CalculatorImpl

    println("*****Calculator*****")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")
    println("5. Power")
    println("6. Absolute Value")
    println("7. Modulus")
    println("8. Maximum of two")
    println("9. Minimum of two")

    println("Choose the option from 1 to 9")
    val choice = io.StdIn.readInt()

    if(choice>=1 && choice<=9)
    {
      if(choice==6)
      {
        println("Enter the number")

        val num = io.StdIn.readInt()

        println(calculate.option(choice,num,0))
      }
      else {
        println("Enter Two Numbers")

        val first = io.StdIn.readInt()
        val second = io.StdIn.readInt()

        println(calculate.option(choice,first,second))
      }
    }
    else
      println("Enter a valid number in the range of 1 to 9")
  }
}
