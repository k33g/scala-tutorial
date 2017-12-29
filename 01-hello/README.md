# 01-hello

## Structure minimum d'un programme Scala

```scala
package demo

object Hello extends App {
  // votre code
}
```

**Lancez** `./run.sh`

## afficher un message

```scala
println("👋 🌍")
println("I ❤️ Scala")
```

## Variables

Il y a des variables **mutables**

```scala
var firstName = "Bob"
println(firstName)
firstName = "Bobby"
println(firstName)
```

Il y a des variables **immutables**

```scala
val lastName = "Morane"
println(lastName)
lastName = "Ballantine" // Compilation failed
println(lastName)
```

## Interpolation de chaînes

Afficher "Bonjour Bob Morane"

```scala
println(s"Bonjour ${firstName} ${lastName}")
```

## Structures de contrôle

```scala
if (firstName == "Bob") {
  println("Hello")
} else {
  println("You are not Bob")
}

if (firstName.equals("Bob")) {
  println("Hello Bob")
} else {
  println("You are not Bob")
}

if (!firstName.equals("Bob")) {
  println("You are not Bob")
} else {
  println("Hello Bob")
}

// and
if (firstName == "Bob" && lastName == "Morane") {
  println("Hello Bob Morane")
} else {
  println("You are not Bob")
}

// or
if (firstName == "Bob" || lastName == "Morane") {
    println(s"Bonjour ${firstName} ${lastName}")
} else {
  println("You are not Bob")
}

// ternary operator
val message = if (firstName == "Bob") "Hello Bob" else "You are not Bob"
println(message)
```

## Boucles

<TODO>

```scala
var a = 0
while (a < 5) {
  println(a)
  a+=1
}
```

```scala
var a = 0
do {
  println(a)
  a+=1
} 
while (a < 5)
```

```scala
for (i <- 1 to 3) println(i)
```

```scala
// with guards
for (i <- 1 to 10 if i < 4) println(i)
```


*Remarques: il y a beaucoup de possibilités, vous pouvez lire cet article: [https://alvinalexander.com/scala/scala-for-loop-examples-syntax-yield-foreach](https://alvinalexander.com/scala/scala-for-loop-examples-syntax-yield-foreach)*

> Si tout compile, vous pouvez passer à `../02-hello-dog`







