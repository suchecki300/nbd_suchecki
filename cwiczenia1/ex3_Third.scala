object ex3_Third {
  def main(args: Array[String]):Unit={
    val weekList: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")

    println(tailRec(weekList, ""))
  }

  def tailRec(list: List[String], text: String): String = list match {
    case Nil => ""
    case i :: x =>
      if (x.isEmpty)
        text + ", " + i
      else if (text.isEmpty)
        tailRec(x, i)
      else
        tailRec(x, text + ", " + i)
  }
}



