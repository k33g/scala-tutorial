package demo

object Hello extends App {
  

  def getToon(name: String): Option[Toon]  = { // always return an Option
    val toons = List(...)
    toons.find(...) // find always returns an Option
  }


}
