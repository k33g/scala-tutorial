# 05-traits-again: Scala is dynamic 😉

Il est possible "d'ajouter" des traits au moment de la création d'une instance de classe:

```scala
trait Country {
  var country: String = "FR"
}

val bob = new Human("Bob") with Country
println(bob.country) // FR
bob.country = "UK"
```

On peut donc créer des "super héros" sans hériter de `SuperHero`

## Exercice

- Complétez `/people/NickName.scala` pour ajouter une propriété `nickName`
- Complétez `/demo/Hello.scala` pour que **Wally** devienne **Kid Flash**