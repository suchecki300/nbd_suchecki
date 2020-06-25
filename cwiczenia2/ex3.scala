object ex3 {
  def main(args: Array[String]):Unit={
    println("--Przyszedł Jan")
    println(helloFunc(new Osoba("Jan", "Nowak")))
    println("--Przyszła Justyna")
    println(helloFunc(new Osoba("Justyna", "Kowalska")))
    println("--Przyszedł Emilian")
    println(helloFunc(new Osoba("Emilian", "Suchecki")))
    println("--Przyszedł Mikołaj")
    println(helloFunc(new Osoba("Mikołaj", "Trzaskowski")))
  }

  def helloFunc(osoba: Osoba): String = osoba match{
    case Osoba("Jan", _) => "Hej Janku!"
    case Osoba("Justyna", _) => "Witaj Justynko!"
    case Osoba(_, "Suchecki") => "Dzień dobry Panie Suchecki"
    case _ => "Hej, " + osoba.imie + "!"
  }
}

case class Osoba(var newImie: String, var newNazwisko: String){
  def imie: String = newImie
  def nazwisko: String = newNazwisko
}
