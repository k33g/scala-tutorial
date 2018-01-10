package demo

object Hello extends App {

  case class FunctorOfString(val value: String) {
    def map(fn: String => String) = { // fn is a lambda that takes a String and return a String
      val res = fn(this.value);
      FunctorOfString(res) // implicit return
    }
    def fmap(fn: String => FunctorOfString) = {
      fn(this.value)
    }
  }

  // functions
  val bold = (txt: String) => s"<b>$txt</b>"
  val h1 = (txt: String) => s"<h1>$txt</h1>"
  val body = (txt: String) => s"<body>$txt</body>"
  val html = (txt: String) => s"<html>$txt</html>"

  val text = FunctorOfString("Hello 🌍")

  val title = (txt: String) => FunctorOfString(txt).map(bold).map(h1)

  println(title("Hello 🌍"))
  println(title("Hello 🌍").value)

  val page = text
            .fmap(title)
            .map(body)
            .map(html)
            .value

  println(page)

}
