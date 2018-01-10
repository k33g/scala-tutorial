# 12-functor

Cette partie est présente à titre éducatif: ce n'est pas pour le moment un exercice, c'est juse pour expliquer un concept.

## Functor ???

Un functor est un wrapper (un contenant) 
 - qui contient une valeur (appelons la `value`) (qui n'est pas modifiable)
 - qui possède une méthode `map` 

```scala
case class Counter(val value: Int) {
  def map() = {}
}
```

**Remarque**: on peut faire ceci avec autre chose qu'une `case class`

La méthode `map` attend comme paramètre une lambda qui a un paramètre du même type que `value` et retourne une valeur du même type que `value`.
Cette méthode `map` va appliquer la lambda à la valeur (`value`) du wrapper et retourner un nouveau wrapper avec une `value` égale au résultat de la lambda

```scala
case class Counter(val value: Int) {
  def map(fn: Int => Int) = {
    val res = fn(this.value);
    Counter(res)
  }
}
```

Donc cette méthode `map` va nous permettre d'obtenir un nouveau wrapper avec une nouvelle valeur sans modifier la valeur initiale (principe d'immutabilité)

```scala
var counter = Counter(1)
var anOtherCounter = counter.map((x: Int) => x + 1).map((x: Int) => x + 1)
println(anOtherCounter.value) // == 3
```

ou 

```scala
var addOne = (x: Int) => x + 1
var multiplyByTwo = (x: Int) => x * 2

var counter = Counter(20)

var anOtherCounter = counter
                      .map(multiplyByTwo)
                      .map(addOne)
                      .map(addOne)

println(anOtherCounter.value) // ==42
```
