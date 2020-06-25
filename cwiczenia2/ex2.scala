object ex2 {
  def main(args: Array[String]) {

    val account = new KontoBankowe(25)

    account.wypiszStanKonta()
    println("Wpłata 100")
    account.wpłata(100)
    account.wypiszStanKonta()
    println("Wypłata 51")
    account.wypłata(51)
    account.wypiszStanKonta()
  }
}

class KontoBankowe(var startKwota: Double) {
  private var stanKonta: Double = startKwota

  def this() {
    this(0);
  }

  def wpłata(kwota: Double) {
    stanKonta = stanKonta + kwota
  }

  def wypłata(kwota: Double) {
    if (kwota <= stanKonta) {
      stanKonta = stanKonta - kwota
    }
  }

  def wypiszStanKonta() {
    println("Stan konta: " + stanKonta)
  }
}
