object Factorial extends App {
  def fact(a:BigInt):BigInt={
    if(a==0) return 1 else return a*fact(a-1)
  }
  println(fact(6))
}
