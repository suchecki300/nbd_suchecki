object ex8_Eight {
  def main(args: Array[String]): Unit = {
    val numberList: List[Int] = List(13, 4, 43, 532, 24, 0, 3, 432, 2, 7, 0, 2, 6)
    print(deleteZeros(numberList, 0))
  }

  def deleteZeros(list: List[Int], n: Int): List[Int] = list match {
    case Nil => Nil
    case h :: t =>
      if (h == n)
        deleteZeros(t, n)
      else
        h :: deleteZeros(t, n)
  }
}
