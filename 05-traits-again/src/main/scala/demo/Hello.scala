package demo

import people.Human
import people.SuperHero
import people.powers._

object Hello extends App {
  
  val kidFlash = new Human("Wally") 
    with NickName 
    with RunFast 
    with GoToTheFuture

  kidFlash.nickName = "Kid Flash"
  
  kidFlash.run
  
  kidFlash.fastForward
  
}
