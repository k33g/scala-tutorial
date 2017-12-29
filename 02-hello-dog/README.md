# 02-hello-dog: First class

En Scala, une classe se décrit de cette manière:

```scala
class Human(var firstName: String, val lastName: String) {
  def hello() = {
    println(s"Hello I'm $firstName $lastName")
  }
}
```

Et vous l'utilisez comme ceci:

```scala
  val bob = new Human("Bob", "Morane")
  bob.firstName = "BOB"
  bob.hello // Hello I'm BOB Morane
```

*Remarque: vous ne pouvez pas changer le lastName de Bob*

## Exercice

Vous avez déjà dans `/animals`, 2 classes:

- `Animal.scala`
- `Dog.scala` qui hérite de `Animal`

Pour les utiliser dans `/demo/Hello.scala` il suffit de les "importer": `import animals._`

**A FAIRE:**

Ajouter une classe `Cat` qui hérite de `Animal` pour que le code ci-dessous compile:

```scala
  val sylvestre = new Cat("Sylvestre")
  sylvestre.meow()
  // doit afficher: meow I'm a 🐱 and my name is Sylvestre
  sylvestre.meow("Hello I've seen a 🐥")
  // doit afficher: Sylvestre : Hello, I've seen a 🐥
```
