object ex_10_Ten {
  def main(args: Array[String]) {
    val numberList = List(5.0, -10, 0, -3.4, -4, 30, 11, 12)

    println("Lista pierwotna")
    println(numberList)

    println("\nLista wynikowa")
    println(getAbsoluteResult(numberList))
  }

  def getAbsoluteResult(list: List[Double]) = {
    list.filter(x => -5 <= x && x <= 12).map(a => a.abs)
  }
}
