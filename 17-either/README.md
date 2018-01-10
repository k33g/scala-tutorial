# 17-either

`Option` c'était bien pour gérer les NPE, mais comment fait-on avec les autres types d'erreur?.

Il existe le type `Either` qui a 2 sous-types: `Left` et `Right`.

- on utilisera `Left` pour "récupérer" l'erreur
- et on utilisera `Right` pour "récupérer" une valeur (Penser à "c'est juste" pour "right")

Par exemple, ci-dessous nous avons une fonction qui va retourner soit un `Left` (si on n'a pas trouvé le bon nombre) soit un `Right`  si c'est gagné

```scala
def guessNumber(n: Int): Either[String, Int] = {
  if(n == 42) Right(n) else Left("missed")
}
println(guessNumber(2)) // Left(missed)
println(guessNumber(42)) // Right(42)
```

Bien sûr, vous pouvez faire du pattern matching avec le `Left` et `Right`

## Exercice

- faites une fonction `divide(a: Int, b:Int)` qui va retourner un `Either`
- gérez la division par 0

### trucs et astuces

un `try catch`  en Scala fonctionne comme ceci:

```scala
try {
  // fooo
} catch {
  case e: Exception => Left(s"😡 ${e.toString}")
}
```
