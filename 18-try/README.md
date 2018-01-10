# 18-try

Un autre type bien pratique pour gérer les erreurs: le type `Try[type] (ex: Try[String])`:

Plus besoin de faire de  `try catch`, faites un `Try(de_quelque_chose)` et vous obtiendrez:

- soit un `Failure` qui contiendra le message d'erreur
- soit un `Success` qui contiendra le résultat

## Exercice

Refaites la division (en gérant la division par 0)
