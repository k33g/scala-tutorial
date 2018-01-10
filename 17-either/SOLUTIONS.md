# Solutions

```scala
def divide(a: Int, b:Int): Either[String, Int] = {
  try {
    Right(a/b)
  } catch {
    case e: Exception => Left(s"😡 ${e.toString}")
  }
}

divide(3, 0) match {
  case Left(message) => println(message)
  case Right(value) => println(value)
}

divide(4, 2) match {
  case Left(message) => println(message)
  case Right(value) => println(value)
}  
```

## Un autre exemple

```scala
def getPage(url: String): Either[String, String] = {
  try {
    Right(fromURL(url).mkString)
  } catch {
    case e: Exception => Left(s"😡 ${e.toString}")
  }
}

getPage("http://www.scala-lang.org") match {
  case Left(message) => println(message)
  case Right(html) => println(html)
}
```