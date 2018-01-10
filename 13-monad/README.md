# 13-monad

Comme pour l'exemple précédent, celui ci est là à titre éducatif.

## Monad ???

On nous a tellement parlé de `Monads`. Nous allons prendre un très gros raccourci:

Une monad(e) est un functor avec une méthode `fmap` (selon les langages on peut trouver un autre nom)

La méthode `fmap` attend en paramètre une lambda
- qui prend comme paramètre une valeur du même type que la valeur (`value`) du wrapper (qui est un functor) 
- qui retourne un nouveau wrapper du même type

La méthode `fmap` applique la lambda à la valeur et en retourne le résultat

```scala
case class Counter(val value: Int) {
  def map(fn: Int => Int) = {
    val res = fn(this.value);
    Counter(res)
  }
  def fmap(fn: Int => Counter) = {
    fn(this.value)
  }
}
```

ce qui signifie que si vous avez des opérations `addOne` ou `multiplyByTwo` qui retourne des wrappers il faudra utiliser `fmap`

```scala
var addOne = (x: Int) => Counter(x + 1)
var multiplyByTwo = (x: Int) => Counter(x * 2)

var counter = Counter(20)

var anOtherCounter = counter
                      .fmap(multiplyByTwo)
                      .fmap(addOne)
                      .fmap(addOne)

println(anOtherCounter.value) // ==42
```

