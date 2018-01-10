# Solutions

```scala
package demo

object Hello extends App {

  def addition(a: Int, b: Int): Int = { a + b }
  def division(a: Int, b: Int): Double = { a / b }

  println(addition(4,5))
  println(division(40,5))

  // lambda
  val multiplication = (a: Int, b: Int) => a * b
  
  println(multiplication(4,5))

}
```