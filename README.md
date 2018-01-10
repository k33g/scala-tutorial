# Scala Workshop

## Alors...

- Objectif: Apprendre Scala
  - découvrir quelques concepts utiles et récurrents
- Une règle unique: Scala c'est simple / doit rester simple
  - pas besoin d'être bon en maths
  - pas besoin d'être un puriste de la programmation fonctionnelle
  - ce n'est pas un cours de programmation fonctionnelle (même si on va en faire un petit peu)
- Beaucoup d'exercices simples: un mini cook-book
  - des exemples à copier, refaire, modifier ...
  - à la fin un exercice plus "compliqué"

### Disclaimer(s)

<TODO 🚧>


## Vous avez besoin de quoi ?

Normalement rien à part l'ensemble du projet [https://github.com/k33g/scala-tutorial](https://github.com/k33g/scala-tutorial). Ce worshop est "autonome" (== rien à installer) et peut fonctionner sans connexion web (à part 2 exercices: les 17 et 18)

... Ah si, il vous faut un IDE ou un éditeur de texte

Sinon, dans la vraie vie, il faut installer Scala et SBT

## Comment a été "fabriqué" le handson?

<TODO 🚧>

## Structure d'un programme(projet) Scala

```
.
├── lib
├── project
├── src
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │   └── scala
│   └── test
│       ├── java
│       ├── resources
│       └── scala
```

### Utilitaire (OSX ou Linux) pour créer rapidement un projet Scala

```shell
project_name="hello"
package_name="demo"

# --- créer la structure ---
mkdir $project_name
cd $project_name
mkdir -p src/{main,test}/{java,resources,scala}
mkdir lib project
mkdir -p src/main/scala/$package_name
mkdir -p src/test/scala/$package_name

# --- générer le code source de départ ---
cat > src/main/scala/$package_name/Hello.scala << EOF
package $package_name

object Hello extends App {
  println("👋 🌍")
}
EOF
```

### Utilitaire (Windows) pour créer rapidement un projet Scala

<TODO 🚧>

## Comment utiliser le projet

### Tout d'abord...

- Munissez vous de votre éditeur préféré (avec la colorisation Scala)
- Puis pour les utilisateurs OSX ou Linux, lancez `. osx.setupenv.sh` ou `. tux.setupenv.sh`
- Puis pour les utilisateurs Windows, lancez `win.setupenv.cmd`

### C'est parti

Il va falloir faire les exercices dans l'ordre, à votre rythme (si vous ne terminez pas, ce n'est pas grave, vous pouvez continuer seul à la maison).

*Remarque, l'exercice `00-dependencies` n'est pas à faire, il sert juste à récupérer les dépendances nécessaires à l'ensemble des exercices [^1]*

#### Par exemple, faire l'exercice `01-hello`

- Dans un terminal (console, ...):
```
cd 01-hello
# si osx or linux
./ run.sh # équivalent de sbt run 

# si windows
run.cmd
```
- avec SBT, nous utilisons le plugin `sbt-revolver` qui permet de relancer la compilation à chaque modification de code [^2]
- Lire `01-hello/README.md`
- Suivre les instructions (== faire l'exercice)
- Modifiez le code de `src/main/scala/demo/Hello.scala`
- Vous trouverez les corrections ici: `01-hello/SOLUTIONS.md`

*Remark: `Ctrl + C` pour quitter et passer à un autre programme*

## Gestion des dépendances

<TODO 🚧> parler de `build.sbt`

## Emojis

<TODO>

## ...

## Ressources

- [https://alvinalexander.com/scala](https://alvinalexander.com/scala)


[^1]: pour ajouter de nouvelles dépendances, modifiez `00-dependencies/build.sbt` puis lancez `cd 00-dependencies` et `./run.online.sh`

[^2]: pour ajouter un plugin SBT dans un projet Scala, modifiez (par exemple) `01-hello/project/plugin.sbt`