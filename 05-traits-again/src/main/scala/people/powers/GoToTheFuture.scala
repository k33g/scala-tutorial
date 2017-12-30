package people.powers

trait GoToTheFuture {
  def nickName: String

  def fastForward() = {
    println(s"$nickName runs to the future")
  }
}
