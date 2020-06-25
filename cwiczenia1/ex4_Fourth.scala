object ex4_Fourth {
  def main(args: Array[String]): Unit = {

    val weekList: List[String] = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela")

    println("foldl")
    print(weekList.foldLeft("")((acc, s) => acc + s + ","))
    println("\n\n" + "foldr")
    print(weekList.foldRight("")((acc, s) => acc + "," + s))

  }
}
