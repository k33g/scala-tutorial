package demo

import io.vertx.core.json.JsonObject
import io.vertx.scala.core.Vertx
import io.vertx.scala.ext.web.Router
import io.vertx.scala.ext.web.handler.StaticHandler

import scala.util.{Try, Failure, Success}

import io.vertx.scala.ext.web.RoutingContext

object Hello extends App {

  implicit class RoutingContextImprovements(val rc: RoutingContext) {
    def json(j: JsonObject): Unit = { 
      rc.response()
        .putHeader("content-type", "application/json;charset=UTF-8")
        .end(j.encodePrettily())
    }
    def html(c: String): Unit = { 
      rc.response()
        .putHeader("content-type", "text/html;charset=UTF-8")
        .end(c)
    }
  }

  val vertx = Vertx.vertx()
  val server = vertx.createHttpServer()
  val router = Router.router(vertx)

  val httpPort = sys.env.getOrElse("PORT", "8080").toInt

  router.get("/hello").handler(context => 
    context.html("<h1>👋 Hello 🌍 😝</h1>")
  )

  router.get("/hey").handler(context => 
    context.json(new JsonObject().put("message", "👋 hey!"))                            
  )

  router.route("/*").handler(StaticHandler.create())

  println(s"🌍 Listening on $httpPort  - Enjoy 😄")
  server.requestHandler(router.accept).listen(httpPort)


}
