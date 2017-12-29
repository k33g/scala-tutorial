package demo



object Hello extends App {

  // function
  def check(value: Any): String = value match {
    case s: String => s"this is a string: $s"
    case i: Int => s"this is an int: $i"
    case _ => "Unknown"
  }
  // lambda
  val checkAgain = (value: Any) => value match {
    case s: String => s"this is a string: $s"
    case i: Int => s"this is an int: $i"
    case _ => "Unknown"
  }

  println(check(42))
  println(checkAgain(34.5))
  println(checkAgain("Hello"))

}
