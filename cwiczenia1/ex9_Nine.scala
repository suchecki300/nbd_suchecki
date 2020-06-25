object ex9_Nine {
  def main(args: Array[String]) {
    val numberList = List(-33214, 0, 1, 5, 0, 32, -43)

    println("Lista pierwotna")
    println(numberList)

    println("\nLista po zwiekszeniu o 1")
    println(increase(numberList))
  }

  def increase(x: List[Int]) = {
    x map (n => n + 1)
  }
}
