package people.powers

trait GoToTheFuture {
  def nickName: String // define variable as abstract

  def fastForward() = {
    println(s"$nickName runs to the future ✨🏃")
  }
}
