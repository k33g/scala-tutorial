package demo

object Hello extends App {

  trait CuteAnimal { } // 👈 first you need it

  case class Dog(val name: String) extends CuteAnimal
  case class Cat(val name: String) extends CuteAnimal
  case class Bird(val name: String) extends CuteAnimal

  val sylvestre = Cat("Sylvestre")
  val titi = Bird("Titi")

  def check(animal: CuteAnimal): Unit = { // Unit is a kind of void
    animal match {
      case Cat(name) => println(s"$name is a 🐱")
      case Dog(name) => println(s"$name is a 🐶")
      case Bird(name) => println(s"$name is a 🐦")
      case _ => println("???")
    }
  }
  // I 😍 match

  check(sylvestre)
  check(titi)

}
