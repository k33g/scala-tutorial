package demo

import animals._

object Hello extends App {

  // c'est l'exercice ... TODO ⚠️
  implicit class AnimalAddSomething(val animal: Animal) {
    def hey: Unit = { println(s"Hey 👋 I'm ${animal.name}") }
  }

  implicit class StringPingPong(val string: String) {
    def ping: String = { s"ping ${string}" }
    def pong: String = { s"pong ${string}" }
    def display: Unit = { println(string) }
  }

  "Hello".ping.display
  "Hello".pong.display
  "Hello".ping.pong.display

  val wolf = new Dog("wolf")
  wolf.hey




}
