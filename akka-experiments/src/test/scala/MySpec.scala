package eu.vytenis.akka

import org.scalatest.flatspec.AnyFlatSpec

class MySpec extends AnyFlatSpec {
  val a = 2
  it should "add one" in {
    assert(a + 1 == 3)
  }
  it should "add two" in {
    assert(a + 3 == 5)
  }
}


