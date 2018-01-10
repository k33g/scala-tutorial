# 16-option-again

## Exercice

- Faites une `case classe` `Toon` avec un `name` et un `avatar`
- Faites une fonction `getToon` qui recherche un toon par son `name` dans une liste de toons et retourne un `Option[Toon]`
  - la liste (`List`) de toons est contenue dans le corps de la fonction:
    ```scala
    val toons = List(
      Toon("po", "🐼"),
      Toon("buster", "🐰"),
      Toon("simba", "🦁")        
    )
    ```
  - une `List` en Scala possède une méthode `find` qui fonctionne sur le même principe que `filter` mais ne retourne qu'un seul élément
  - `find` en Scala retourne toujours un `Option`
- Testez `getToon` avec du pattern matching
- Affichez l'avatar du toon et si il n'existe pas affichez "😜" (ou ":p")

... au fait, `Option` est une monade
