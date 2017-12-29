package demo

object tools {
  // this is a method
  def addition(a: Int, b: Int): Int = { a + b }
}

// division(a: Int, b: Int): Double = { a / b }

object Hello extends App {

  println(tools.addition(4,5))

  // this is a function aka lambda
  val multiplication = (a: Int, b: Int) => a * b
  
  println(multiplication(4,5))
}
