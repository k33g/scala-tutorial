# 04-traits

Un **trait** c'est le moyen d'ajouter des fonctionnalités à une classe, et de les partager avec d'autres classes

Par exemple, prenons notre classe `Human`:

```scala
class Human(val name: String = "John Doe") extends Creature {

  def hello() = {
    println(s"Hello I'm $name")
  }

  def say(something: String) = {
    println(s"🤖 $something")
  }
}
```

Je voudrais lui ajouter une méthode `hi()` que je vais définir dans un **trait**:

**SayHi.scala**

```scala
trait SayHi {
  def name: String

  def hi() = {
    println(s"Hi, I'm $name")
  }
}
```

Et on utilisera le trait avec le mot clé `with`

```scala
class Human(val name: String = "John Doe") extends Creature with SayHi {
  // foo
}
val bob = new Human("Bob")
bob.hi() // Hi, I'm Bob
```

## Exercice

- nous avons une classe `/people/SuperHero.scala`
- nous avons une classe `/people/Speedster.scala` qui hérite de `SuperHero`

On souhaite ajouter 2 super pouvoirs au `Speedster`:

- `run()`
- `fastForward()`

**/demo/Hello.scala**
```scala
val flash = new Speedster("Barry Allen", "The Flash")

flash.run()
flash.fastForward()
```

### Donc

- compléter les traits qui sont dans `/people/powers`
- ajouter les pouvoirs à `/people/Speedster.scala`

... pour que le projet compile