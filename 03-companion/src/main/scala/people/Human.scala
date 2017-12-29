package people

class Human(val name: String = "John Doe") extends Creature {

  def hello() = {
    println(s"Hello I'm $name")
  }

}
/**
 * Companion object
 */
object Human {

}