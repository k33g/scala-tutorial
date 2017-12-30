package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._

import services.Hello

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def hello = Action {

    Ok(
      Json.toJson(Hello.jsonMessage)
    )
  }

}
