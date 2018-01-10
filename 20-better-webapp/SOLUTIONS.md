# Solutions

```scala
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
```