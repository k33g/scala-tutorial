# 11-implicits

Définition: une manière d'augmenter Scala

Les `implicits` représentent un vaste sujet qui vaudrait un workshop à lui tout seul. On ne va en voir qu'une très petite partie mais qui est très intéressante (et puissante).

Scala est un langage dynamique (troll) on peut ajouter des comportements à la volée à des types:

```scala
implicit class AugmentedTypeWhatEver(val value: AugmentedType) {
  def ola: Unit = { 
    // do something with value
  }
}
```

Je peux aussi augmenter un type Scala. Par exemple ci-dessous j'ajoute 3 méthodes au type `String`

```scala
  implicit class StringPingPong(val string: String) {
    def ping: String = { s"ping ${string}" }
    def pong: String = { s"pong ${string}" }
    def display: Unit = { println(string) }
  }

  "Hello".ping.display
  "Hello".pong.display
  "Hello".ping.pong.display
```

## Exercice

- ajouter (en utilisant les `implicits`) une méthode `hey` la classe `Animal` (cf `animals/Animal.scala`) qui va afficher "Hey I'm " suivi du nom de l'animal
- la tester en utilisant un `Dog` (cf `animals/Dog.scala`)

