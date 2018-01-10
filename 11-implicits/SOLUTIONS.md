# Solutions

```scala
implicit class AnimalAddSomething(val animal: Animal) {
  def hey: Unit = { println(s"Hey 👋 I'm ${animal.name}") }
}

val wolf = new Dog("wolf")
wolf.hey
```