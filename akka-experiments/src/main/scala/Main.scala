package eu.vytenis.akka

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

object Main extends App {
  val as = ActorSystem("MyTest")
  println(as.name)
  val a1 = as.actorOf(Props[MyActor])
  val a2 = as.actorOf(Props[MyActor], "aaa")
  a1 ! "Hi"
  a2 ! "Hi hi"
  println(a1)

  class MyActor extends Actor with ActorLogging {
    override def receive: Receive = {
      case message => log.info(s"Got $message");
    }
  }

  def z(a: Int)(implicit b: Int, c: Int) = a + b
}
