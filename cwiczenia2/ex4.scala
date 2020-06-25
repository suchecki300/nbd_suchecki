object ex4 {
  def main(args: Array[String]): Unit = {
    println(tripleFunc(x => x + x, 12))
  }

  def tripleFunc(func: Int => Int, x: Int): Int = func(func(func(x)))
}
