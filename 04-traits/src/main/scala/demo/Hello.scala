package demo

import people._

object Hello extends App {
  val flash = new Speedster("Barry Allen", "The Flash")

  flash.run() // "The Flash runs fast"
  flash.fastForward() // "The Flash runs to the future"

}

