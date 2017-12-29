package people

import people.powers._

class Speedster(name: String, nickName: String) 
  extends SuperHero(name, nickName) 
  // add super powers
  with RunFast 
  with GoToTheFuture {

}
