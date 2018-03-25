package demo

import io.vertx.core.json.JsonObject
import io.vertx.scala.core.Vertx
import io.vertx.scala.ext.web.Router
import io.vertx.scala.ext.web.handler.StaticHandler

import scala.util.{Try, Failure, Success}

import io.vertx.scala.ext.web.RoutingContext

object Hello extends App {

  // do black magic here ...


  // end of black magic

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
