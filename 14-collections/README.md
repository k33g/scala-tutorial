# 14-collections

On peut faire des choses très puissantes et simplement avec les collection Scala (et c'est beaucoup plus lisible que les stream Java)

**Filtrer** une liste (on obtient une nouvelle liste):

```scala
  val numbers = List(1,2,3,4,5,6,7,8,9,10)

  val allNumbersLessThanSix = numbers.filter(x => x < 6) // List(1, 2, 3, 4, 5)
```

**Appliquer** des traitement à tous les éléments de la liste:

```scala
  val multiplyAllByFour = allNumbersLessThanSix.map(x => x * 4) // List(4, 8, 12, 16, 20)

  // à quoi cela vous fait penser ?
```

**Obtenir un résultat** à partir de l'aggrégation d'opération sur les éléments

```scala
  var sumAll = multiplyAllByFour.fold(0) { (tmp, number) => tmp + number } // 60
```

## Exercice 

Vous avez une liste d'aliments

```scala
val aliments = List(
    "🍞"
  , "🍃"
  , "🍅"
  , "🍖"
  , "🍟"
  , "😭" // 😡 pas d'emoji oignons    
)
```

si les emojis ne passent pas:

```scala
val aliments = List(
    "pain"
  , "salade"
  , "tomate"
  , "viande"
  , "frites"
  , "oignons" // 😡 pas d'emoji oignons    
)
```

Vous voulez faire un sandwich sans frites et sans oignons avec des morceaux de pain, de salade et de tomate.

C'est à dire: 

- vous allez avoir une nouvelle liste `ingredients` issue de transformation sur `aliments` 
- qui aura le contenu suivant: `List(morceaux de 🍞, morceaux de 🍃, morceaux de 🍅, morceaux de 🍖)`
- puis vous allez construire votre `kebab` à partir de `ingredients` pour obtenir `🥙 avec: morceaux de 🍞 morceaux de 🍃 morceaux de 🍅 morceaux de 🍖` (c'est une `String`)

vous pouvez essayer d'autres recettes


