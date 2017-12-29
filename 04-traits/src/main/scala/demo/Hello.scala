package demo

import people._

object Hello extends App {
  val flash = new Speedster("Barry Allen", "The Flash") // a class and more...

  println(flash.id)

  flash.run()
  
  flash.fastForward()
}

