object FunctionBasic extends App {        //Case classes are immutable and are compared by value
case class Point(x:Int, y:Int)
  val p1 = new Point(2,3)
  val p2 = new Point(3,4)
  val p3 = new Point(4,5)
  if(p1==p2)
    {
      println("They are same")
    }
  else
    {
      println("They are different")
    }
}
