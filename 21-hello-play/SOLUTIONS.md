# Solutions

`services/Divide.scala`

```scala
package services

import play.api.libs.json._
import scala.util.{Try, Failure, Success}

object Divide {
    
  def jsonDivide(a:Int, b:Int) = {
    Try(a/b) match {
      case Failure(err) => JsObject(Seq(
        "message" -> JsString(err.getMessage)
      ))
      case Success(value) => JsObject(Seq(
        "result" -> JsNumber(value)
      ))
    }
  }
  
}
```

`controllers/DivideController.scala`

```scala
package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._

import services.Divide

@Singleton
class DivideController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def divide(a: Int, b: Int) = Action {

    Ok(
      Json.toJson(Divide.jsonDivide(a, b))
    )
  }

}
```