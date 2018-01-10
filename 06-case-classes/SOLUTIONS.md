# Solutions

```scala
package demo

object Hello extends App {

  case class TinyToon(val name: String, val avatar: String = "🤔") {
    def hello() = {
      println(s"Hello I'm $name and I'm a $avatar")
    }
  }

  val babs = TinyToon("Babs", "🐰")  // no new
  val buster = TinyToon("Buster", "🐰")
  val fakeBabs = TinyToon("Babs", "🐰") 

  println(babs == fakeBabs) // compare by value true
  println(babs == buster) // false

}
```