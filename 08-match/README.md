# 08-match

'match' en Scala est très pratique, pensez à `switch` ou `select case` mais en plus puissants

```scala
val salutation = "Hello"

salutation match {
  case "Hello" => println("HELLO") // va afficher HELLO
  case "Hi" => println("HI")
  case _ => println("???")
}
```

Vous pouvez aussi affecter le résultat à une variable/constante:

```scala
val result  = salutation match {
  case "Hello" => "HELLO" // result == "HELLO"
  case "Hi" => "HI"
  case _ => "???"
}

println(result)
```

Vous pouvez ajouter des **"guards"**

```scala
val salutation = "Salutation"

salutation match {
  case "Hello" => println("HELLO")
  case "Hi" => println("HI")
  // ceci est un guard
  case value if value.startsWith("S") => println("Salut") // va afficher Salut
  case _ => println("???")
}
```

## Exercice

- créer une lambda `multiplication` qui retourne le produit de 2 valeurs
- faire un `match` qui va tester le résultat de `multiplication`
  - et afficher un message quand le résultat est égal à 42
  - et afficher un message quand le résultat est égal à 21
  - et afficher un message quand le résultat est supérieur à 21
  - et sinon afficher un message par défaut


## Ressources

- https://docs.scala-lang.org/tour/pattern-matching.html
- https://alvinalexander.com/scala/using-match-expression-like-switch-statement
- https://alvinalexander.com/scala/how-to-use-pattern-matching-scala-match-case-expressions
