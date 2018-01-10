# 09-pattern-matching

`match` est réellement très pratique puisque vous pouvez aussi tester le type d'un élément:

```scala
case s: String => s"this is a string: $s"
```

## Exercice

Coder une lambda `check` qui attend un paramètre de type `Any` et qui teste si ce paramètre est:

- un entier `Int`, alors retourner "Integer"   
- une chaîne de caractères, alors retourner "String" 
- sinon retourner "Unknown"

et l'essayer (`println`) avec un entier, un décimal, une chaîne de caractères, ou tout autre chose

