# 10-pattern-matching-again

`match` est vraiment sympa et vous pouvez aussi l'utiliser avec les `case classes`:

```scala
case MyAmazingCaseClass(value) => println(s"hello $value")
```

## Exercice

- définissez 3 `case classes`: `Cat`, `Dog`, `Bird`, `Tiger` qui ont comme propriété `name`
- elles ont un `trait`en commun `CuteAnimal` (vous pouvez le laisser vide)
- définissez une lambda `check` qui prend comme paramètre un `CuteAnimal` et qui teste 
  - si c'est un chat, et affiche le nom du chat suivi de " est un chat"
  - si c'est un chien, et affiche le nom du chien suivi de " est un chien"
  - si c'est un oiseau, et affiche le nom de l'oiseau suivi de " est un oiseau"
  - sinon affiche "quelque chose"
  