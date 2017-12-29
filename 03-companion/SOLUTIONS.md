# Solutions

**file:** `people/Human.scala`
```scala
package people

class Human(val name: String = "John Doe") extends Creature {

  def hello() = {
    println(s"Hello I'm $name")
  }

  def say(something: String) = {
    println(s"🤖 $something")
  }
}
/**
 * Companion object
 */
object Human {
  val message = "we are the 🌍, we are the 👨‍👩‍👧‍👦"
  
  def create(something: String) = new Human(something) 
  
}
```