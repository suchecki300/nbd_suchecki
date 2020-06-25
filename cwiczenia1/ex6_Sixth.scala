object ex6_Sixth {
  def main(args: Array[String]):Unit={
    val tuple = Tuple3("Emil Suchecki", 100.23, 2)
    tuplePrintf(tuple)
  }

  def tuplePrintf(myTuple: (String, Double, Int)):Unit={
    print(myTuple._1 + ", " + myTuple._2 + ", " + myTuple._3)
  }
}
