# Companions objects

En Scala, il n'y a pas de méthode ou classe `static`, mais on peut créer un "Companion object" pour la classe qui "portera" l'équivalent de ces méthodes statiques

```scala
class Human(val name: String) {
  // foo
}

/**
 * Companion object
 */
object Human {
  def hello() = println("Hello")
}
```

Et vous l'utilisez comme ceci:

```scala
Human.hello
```

## Exercice

**A FAIRE:**

Complétez `/people/Human.scala` pour que le code de `/demo/Hello.scala` compile