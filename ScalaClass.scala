object FunctionBasic extends App {
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit =
      println(prefix + name + suffix)
  }
  val Greet= new Greeter("Arjun","Sharma" )
  Greet.greet(" BD ")
}
