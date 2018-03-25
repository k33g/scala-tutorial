# 07-functions

En Scala, on peut définir des fonctions (plus simplement qu'en Java):

```scala
object Hello extends App {
  def addOne(a: Int): Int = { a + 1 }
  def addTwo(a: Int): Int =  a + 2

  println(addOne(4)) 
  println(addTwo(4)) 

}
```

Il y a aussi bien sûr les lambdas:

```scala
object Hello extends App {

  val addThree = (a: Int):Int =>  a + 3
  println(addThree(4)) 

  // if you want to specify the type
  val addFour = ((a: Int) =>  a + 4 ): (Int => Int)
  println(addFour(4))

}
```

## Astuce: si vous voulez définir des fonctions en dehors

```scala
// see https://stackoverflow.com/a/39031194/1400950

package foo.bar

object square extends (Int => Int) {
  def apply(x: Int): Int = x * x
}

square(45)
```

## Exercice

- addition
- division
- multiplication
