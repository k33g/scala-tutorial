# Solutions

```scala
// lambda
val check = (value: Any) => value match {
  case s: String => s"this is a string: $s"
  case i: Int => s"this is an int: $i"
  case _ => "Unknown"
}

```