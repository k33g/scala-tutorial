# play-scala-minimalist-example

Ceci est une petite application [PlayFramework](https://www.playframework.com/)

Nous allons vous décrire son fonctionnement.

## Exercice

Faire une API `divide` (ex `http://localhost:9000/42/2`)

- ajoutez cette route dans `conf/routes`:
  ```
  GET /divide/:a/:b controllers.DivideController.divide(a: Int, b: Int)
  ```
- créez le service `Divide.scala`
- créez le contrôleur `DivideController.scala`
