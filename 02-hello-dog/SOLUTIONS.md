# Solutions

**file:** `animals/Cat.scala`
```scala
package animals

class Cat(name: String) extends Animal(name) {
  def meow() = {
    println(s"meow I'm a 🐱 and my name is $name")
  }

  def meow(message: String) {
    println(s"$name : $message")
  }
}
```