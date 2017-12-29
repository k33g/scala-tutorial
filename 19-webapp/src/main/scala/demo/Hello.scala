package demo

import io.vertx.core.json.JsonObject
import io.vertx.scala.core.Vertx
import io.vertx.scala.ext.web.Router
import io.vertx.scala.ext.web.handler.StaticHandler

import scala.util.{Try, Failure, Success}

object Hello extends App {
  val vertx = Vertx.vertx()
  val server = vertx.createHttpServer()
  val router = Router.router(vertx)

  val httpPort = sys.env.getOrElse("PORT", "8080").toInt

  router.get("/hello").handler(context => 
    context
      .response()
      .putHeader("content-type", "text/html;charset=UTF-8")
      .end("<h1>Hello 🌍</h1>")
  )

  router.get("/hey").handler(context => 
    context
      .response()
      .putHeader("content-type", "application/json;charset=UTF-8")
      .end(new JsonObject().put("message", "👋 hey!").encodePrettily())                            
  )

  // le faire sans le try et demander aux gens de gérer les erreurs
  router.get("/divide/:a/:b").handler(context => {
    Try(
      context.request.getParam("a").get.toInt / context.request.getParam("b").get.toInt
    ) match {
        case Failure(e) => 
          context
            .response()
            .putHeader("content-type", "application/json;charset=UTF-8")
            .end(new JsonObject().put("message", e.getMessage).encodePrettily())
        case Success(result) => 
          context
            .response()
            .putHeader("content-type", "application/json;charset=UTF-8")
            .end(new JsonObject().put("result", result).encodePrettily())                            
      } // end match
  }) // end handler

  router.route("/*").handler(StaticHandler.create())

  println(s"🌍 Listening on $httpPort  - Enjoy 😄")
  server.requestHandler(router.accept).listen(httpPort)


}
