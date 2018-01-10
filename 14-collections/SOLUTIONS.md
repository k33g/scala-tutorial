# Solutions

```scala
val aliments = List(
    "🍞"
  , "🍃"
  , "🍅"
  , "🍖"
  , "🍟"
  , "😭" // 😡 pas d'emoji oignons    
)

println(aliments)  // 1️⃣

// === action recette ===
def decouper(aliment: String): String = s"morceaux de $aliment"

//val decouper = (aliment: String) => s"morceaux de $aliment"

// === choix aliments ===
def sansFrite(aliment: String): Boolean = aliment != "🍟"
def sansOignon(aliment: String): Boolean = aliment != "😭"

// === filtrer, puis découper ===
val ingredients = 
  aliments
    .filter(sansFrite)
    .filter(sansOignon)
    .map(decouper)  // List is a Functor ... even a Monad

println(ingredients) // 2️⃣

// === assembler ==== aka reduce
val kebab = 
  ingredients
    .fold("🥙 avec: ") { (tmp, ingredient) => tmp + ingredient + " "}

println(kebab) // 3️⃣

println(
  aliments
    .filter(sansFrite)
    .map(decouper)
    .fold("🥙 avec: ") { (tmp, ingredient) => tmp + ingredient + " "}
) // 4️⃣

```