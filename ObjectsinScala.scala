object FunctionBasic extends App {        //Case classes are immutable and are compared by value
object ID{
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
    }
  }
  val id1 : Int = ID.create()
  println(id1)
  val id2 : Int = ID.create()
  println(id2)
}
