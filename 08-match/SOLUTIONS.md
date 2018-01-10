# Solutions

```scala
val multiplication = (a: Int, b: Int) => a * b

multiplication(11, 2) match {
  case 42 => println("😀")
  case 21 => println("😡")
  // a guard
  case r if r > 21 => println("🎃")
  case _ => println("🤔")
}
```