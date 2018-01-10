# 19-webapp

Dans l'exercice précédent nous avions

```scala
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
```

Cela serait bien de pouvoir écrire quelque chose de plus simple comme ceci:

```scala
router.get("/hello").handler(context => 
  context.html("<h1>👋 Hello 🌍 😝</h1>")
)

router.get("/hey").handler(context => 
  context.json(new JsonObject().put("message", "👋 hey!"))                            
)
```

## Exercice

- le type de context est `RoutingContext` (`import io.vertx.scala.ext.web.RoutingContext`)
- ajoutez une méthode `html` à `RoutingContext`
- ajoutez une méthode `json` à `RoutingContext`

