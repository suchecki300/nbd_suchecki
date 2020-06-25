object ex7_Seventh {
  def main(args: Array[String]) {
    val prizeMap: Map[String,Double] = Map("chleb" -> 3.50, "jajka" -> 1.50, "snickers" -> 2.20, "cukier" -> 1.40)

    println("Ceny")
    for ((k, v) <- prizeMap) printf("%10s: %.2f ", k, v)
    println()
    println("Ile kosztuje chleb?")
    println(checkIfExist(prizeMap.get("chleb")))
    println()

    println("Ile kosztuja jajka?")
    println(checkIfExist(prizeMap.get("jajka")))
    println()

    println("Ile kosztuje snickers?")
    println(checkIfExist(prizeMap.get("snickers")))
    println()

    println("Ile kosztuje cukier?")
    println(checkIfExist(prizeMap.get("cukier")))
    println()
  }

  def checkIfExist(x: Option[Double]) = x match {
    case Some(s) => s
    case None => "Nie okreslono"
  }
}
