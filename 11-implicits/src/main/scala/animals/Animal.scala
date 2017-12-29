package animals

class Animal(val name: String) { // val => immutable property ⚠️
  def hello() = {
    println(s"Hello I'm $name") // string interpolation
  }
}
