# Solutions

```scala
  def divide(a: Int, b:Int): Try[Int] = Try(a/b)

  divide(3, 0) match {
    case Failure(err) => println(s"😡 ${err.getMessage}")
    case Success(value) => println(value)
  }

  divide(4, 2) match {
    case Failure(err) => println(s"😡 ${err.getMessage}")
    case Success(value) => println(value)
  }  
```

## Un autre exemple

```scala
def getPage(url: String): Try[String] = Try(fromURL(url).mkString)

getPage("http://www.scala-lang.org") match { 
  case Failure(err) => println(s"😡 ${err.getMessage}")
  case Success(html) => println(html)
}
```
