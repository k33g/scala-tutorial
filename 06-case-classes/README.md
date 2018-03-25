# 06-case-classes

Les "cases classes": c'est la possibilité de déclarer des classes "simplifiées":

```scala
case class Human(val name: String){}
```

Vous pouvez les déclarer où vous voulez, même à la volée dans le code:

```scala
package demo

object Hello extends App {
  println("Hello")

  // oh, une case classe
  case class Human(val name: String){}
}
```

Pas besoin de `new` pour l'instancier:

```scala
val bob = Human("Bob")
```

Une case classe peut avoir des méthodes:

```scala
case class Human(val name: String){
  def hey() = {
    println("Hey!")
  }
}
```

**Remarque**: vous pouvez comparer des instances de case classe par **valeur**

## Exercice

- créer une case classe `TinyToon` avec 2 propriétés (par exemple: `name` et `avatar`)
- créer 3 tiny toons: babs, buster et fakeBabs (avec les mêmes valeurs d'attributs que Babs), puis tester les équivalences entre instances
