package demo

  /**
   * Option:
   * This class represents optional values.
   * Instances of Option are either 
   *   - instances of case class Some 
   *   - or it is case object None.
   */


object Hello extends App {
  println("👋 🌍")
  val hello = Option(42)
  println(hello)

  println(hello.getOrElse("😜"))
}
