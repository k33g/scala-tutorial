package demo

object Hello extends App {
  
  val hello = Option("Hello")
  println(hello)
  println(hello.get)
  println(hello.getOrElse("Hi"))

  val hi = Option(null)
  println(hi)
  //println(hi.get) get n'existe pas sur un None
  println(hi.getOrElse("Hi"))

}
