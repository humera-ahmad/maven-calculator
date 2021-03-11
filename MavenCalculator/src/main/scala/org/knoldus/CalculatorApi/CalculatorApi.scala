package org.knoldus.CalculatorApi

class CalculatorApi {
  // This method add two numbers
  def addition (firstNumber : Int , secondNumber : Int) : Int  = {
    firstNumber + secondNumber
  }

  // This method subtracts number2 from number1
  def subtraction(firstNumber : Int , secondNumber : Int) : Int = {
    firstNumber - secondNumber
  }

  // This method multiplies two numbers
  def multiplication(firstNumber : Int , secondNumber : Int) : Int = {
    firstNumber * secondNumber
  }

  // This method is to perform division
  def division (firstNumber : Int , secondNumber : Int) : Int = {
    if (secondNumber==0) {
      0
    }
    else {
      firstNumber / secondNumber
    }
  }

  // This method is for calculating power of a number
  def power(firstNumber: Int, secondNumber: Int): Double = {
    Math.pow(firstNumber, secondNumber)
  }

  // This method is for calculating absolute value
  def absolute(number:Int):Int = {
    Math.abs(number)
  }

  // Method for calculating modulus
  def modulus(firstNumber:Int , secondNumber:Int):Int = {
    firstNumber % secondNumber
  }

  // Method for calculating maximum among two number
  def maximum(firstNumber:Int , secondNumber:Int):Int = {
    if(firstNumber > secondNumber) {
      firstNumber
    }
    else {
      secondNumber
    }
  }

  // Method for calculating minimum among two numbers
  def minimum(firstNumber:Int,secondNumber:Int):Int = {
    if(firstNumber<secondNumber) {
      firstNumber
    }
    else {
      secondNumber
    }
  }
}
