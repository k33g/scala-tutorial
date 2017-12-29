package demo

import animals._

object Hello extends App {

  val wolf = new Dog("wolf")

  println(wolf.name)
  wolf.hello 
  wolf.wouaf 

  val sylvestre = new Cat("Sylvestre")
  sylvestre.meow()
  sylvestre.meow("Hello, I've seen a 🐥")

}

