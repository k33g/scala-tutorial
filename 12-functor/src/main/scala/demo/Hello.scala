package demo

object Hello extends App {

  // this is a sample of functor
  // a wrapper around a value
  // with a map method
  // could be a class too
  
  case class FunctorOfString(val value: String) {
    def map(fn: String => String) = { // fn is a lambda that takes a String and return a String
      val res = fn(this.value);
      FunctorOfString(res) // implicit return
    }
  }

  val text = FunctorOfString("Hello 🌍")

  println(text)
  println(text.value)

  // functions
  val bold = (txt: String) => s"<b>$txt</b>"
  val h1 = (txt: String) => s"<h1>$txt</h1>"
  val body = (txt: String) => s"<body>$txt</body>"
  val html = (txt: String) => s"<html>$txt</html>"

  val page = text
              .map(bold)
              .map(h1)
              .map(body)
              .map(html)
              .value

  println(page)


}
