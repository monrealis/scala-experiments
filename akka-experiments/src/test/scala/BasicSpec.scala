package eu.vytenis.akka

import akka.actor.ActorSystem
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, BeforeAndAfterEach, OneInstancePerTest}
import org.scalatest.wordspec.AnyWordSpecLike

class BasicSpec extends TestKit(ActorSystem("BasicSpec"))
  with ImplicitSender
  with AnyWordSpecLike
  with BeforeAndAfterAll
  with BeforeAndAfterEach
  with OneInstancePerTest {

  override def afterAll(): Unit = TestKit.shutdownActorSystem(system)

  var x: Int = 1

  override def beforeEach(): Unit = {
    //x = 1
  }

  "actor system" should {

    "be not null" in {
      x += 1
      assert(x == 2)
      assert(system != null)
    }
    "be named" in {
      x += 1
      assert(x == 2)
      assert(system.name == "BasicSpec")
    }
  }
}
