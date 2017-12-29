package demo

import people._

object Hello extends App {

  println(Human.message) // see Human.scala

  val bob = Human.create("Bob Morane") // see Human.scala

  bob.say("👋 Hi")

}
