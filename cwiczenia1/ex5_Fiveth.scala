object ex5_Fiveth {
  def main(args: Array[String]) {
    val prizeMap: Map[String,Double] = Map("chleb" -> 3.50, "jajka" -> 1.50, "snickers" -> 2.20, "cukier" -> 1.40)

    println("Przed obniżką")
    for ((k,v) <- prizeMap) printf("%10s: %.2f\n", k, v)

    val prizeMapDiscount = prizeMap.map{ case (nazwa, cena) => (nazwa, 0.9 * cena) }

    println("\n" + "Po obniżce")
    for ((k,v) <- prizeMapDiscount) printf("%10s: %.2f\n", k, v)
  }
}
