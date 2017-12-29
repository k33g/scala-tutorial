package people.powers

trait RunFast {
  def nickName: String // define variable as abstract

  def run() = {
    println(s"⚡️ $nickName runs fast")
  }
}
