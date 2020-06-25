object ex1 {
  def main(args: Array[String]) {
    print("poniedziałek - ")
    println(checkStatusDay("poniedziałek"))

    print("środa - ")
    println(checkStatusDay("środa"))

    print("ogórek - ")
    println(checkStatusDay("ogórek"))

    print("wtorek - ")
    println(checkStatusDay("wtorek"))

    print("sobota - ")
    println(checkStatusDay("sobota"))
  }

  def checkStatusDay(x: String) = x match {
    case "poniedziałek" | "wtorek" | "środa" | "czwartek" | "piątek" => "Praca"
    case "sobota" => "Weekend"
    case "niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}
