package demo

/*
https://docs.scala-lang.org/tour/pattern-matching.html
https://alvinalexander.com/scala/using-match-expression-like-switch-statement
https://alvinalexander.com/scala/how-to-use-pattern-matching-scala-match-case-expressions
*/

object Hello extends App {
  val multiplication = (a: Int, b: Int) => a * b

  multiplication(11, 2) match {
    case 42 => println("😀")
    case 22 => println("😡")
    // a guard
    case r if r > 22 => println("🎃")
    case _ => println("🤔")
  }

}
