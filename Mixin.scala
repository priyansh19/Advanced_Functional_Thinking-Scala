object Mixin extends App {
  abstract class A {
    val message: String
  }
  class B extends A {
    val message = "I'm an instance of class B"
  }
  trait C extends A {
    def loudMessage = message.toUpperCase()
  }
  class D extends B with C

  val d = new D
  println(d.message)  // I'm an instance of class B
  println(d.loudMessage)
}
