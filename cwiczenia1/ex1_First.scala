object ex1_First {
  def main(args: Array[String]) {
    val weekList: List[String] = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela")

    println("1.a")
    for (i <- weekList) {
      println(i)
    }

    println("1.b")
    for (i <- weekList) {
      if (i.startsWith("p")) {
        println(i)
      }
    }

    println("1.c")
    var i = 0;
    while (i < (weekList.length)) {
      println(weekList(i))
      i += 1
    }

  }

}
