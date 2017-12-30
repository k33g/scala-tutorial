# Solutions

**/people/powers/RunFast.scala**
```scala
package people.powers

trait RunFast {
  def nickName: String

  def run() = {
    println(s"$nickName runs fast")
  }
}
```

**/people/powers/GoToTheFuture.scala**
```scala
package people.powers

trait GoToTheFuture {
  def nickName: String

  def fastForward() = {
    println(s"$nickName runs to the future")
  }
}
```



**/people/Speedster.scala**
```scala
package people

import people.powers._

class Speedster(name: String, nickName: String) 
  extends SuperHero(name, nickName) 
  with RunFast 
  with GoToTheFuture {

}
```

