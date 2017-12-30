package demo

import people.Human
import people.powers._

object Hello extends App {
  
  val kidFlash = new Human("Wally") 

  kidFlash.nickName = "Kid Flash"
  
  kidFlash.run // "Kid Flash runs fast"
  
  kidFlash.fastForward // "Kid Flash runs to the future"
  
}
