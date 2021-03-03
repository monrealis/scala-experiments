package eu.vytenis.akka

import akka.actor.ActorSystem

object Main extends App {
  var as = ActorSystem("MyTest")
  println(as.name)
}
