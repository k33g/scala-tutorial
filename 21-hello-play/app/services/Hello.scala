package services

import play.api.libs.json._

object Hello {
    
  def jsonMessage = JsObject(Seq(
    "message" -> JsString("👋 Hello 🌍 !!!"),
    "number" -> JsNumber(42)
  ))

}
