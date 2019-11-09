object FunctionBasic extends App {        //Case classes are immutable and are compared by value
trait Greeter
  {
    def greet(name : String) : Unit =
      println("Hello " + name + "!")
    }
class DefaultGreeter extends Greeter

  class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
    override def greet(name: String): Unit = {  //overriding the trait's method here
      println(prefix + name + postfix)
    }
  }
  val greeter = new DefaultGreeter()
  greeter.greet("Arjun") // Hello, Arjun!

  val customGreeter = new CustomizableGreeter("How are you, ", "?")
  customGreeter.greet("Scala developer")
}
