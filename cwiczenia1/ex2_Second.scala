object ex2_Second {
  def main(args: Array[String]): Unit = {

    val weekList: List[String] = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela")

    println("2.a")
    recursion(weekList)

    println("2.b")
    recursionInverse(weekList)
  }

  def recursion(x: List[Any]) {
    if (!x.isEmpty) {
      println(x.head)
      recursion(x.tail)
    }
  }

  def recursionInverse(x: List[Any]) {
    if (!x.isEmpty) {
      recursionInverse(x.tail)
      println(x.head)
    }
  }


}
