# Solutions

```scala
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
```