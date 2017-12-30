# Solutions

**/people/powers/NickName.scala**
```scala
package people.powers

trait NickName {
  var nickName: String = ""
}
```

**/demo/Hello.scala**
```scala
package demo

import people.Human
import people.powers._

object Hello extends App {
  
  val kidFlash = new Human("Wally") 
    with NickName 
    with RunFast 
    with GoToTheFuture

  kidFlash.nickName = "Kid Flash"
  
  kidFlash.run // "Kid Flash runs fast"
  
  kidFlash.fastForward // "Kid Flash runs to the future"
  
}
```