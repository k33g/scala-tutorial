package demo

object Hello extends App {

  case class TinyToon(val name: String, val avatar: String = "🤔") {
    def hello() = {
      println(s"Hello I'm $name and I'm a $avatar")
    }
  }

  val babs = TinyToon("Babs", "🐰")  // no new
  val buster = TinyToon("Buster", "🐰")

  println(babs == TinyToon("Babs", "🐰")) // compare by value
  println(babs == buster)

  buster.hello

  println(babs)

}
