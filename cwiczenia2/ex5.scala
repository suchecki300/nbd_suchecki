object ex5 {
  def main(args: Array[String]) {
    println("Pensja wynosi 1000")

    val student = new Osoba("Emilian", "Suchecki") with Student
    val pracownik = new Osoba("Tomasz", "Kot") with Pracownik
    val nauczyciel = new Osoba("Michał", "Nauczycielski") with Nauczyciel

    val studentPracownik = new Osoba("Harry", "Potter") with Student with Pracownik
    val pracownikStudent = new Osoba("Luke", "Skywalker") with Pracownik with Student
    val studentNauczyciel = new Osoba("Mistrz", "Yoda") with Student with Pracownik


    println(s"Student ${student.imie} ${student.nazwisko} płaci podatek: ${student.podatek}")
    println(s"Pracownik ${pracownik.imie} ${pracownik.nazwisko} płaci podatek: ${pracownik.podatek}")
    println(s"Nauczyciel ${nauczyciel.imie} ${nauczyciel.nazwisko} płaci podatek: ${nauczyciel.podatek}")
    println(s"Student-pracownik ${studentPracownik.imie} ${studentPracownik.nazwisko} płaci podatek: ${studentPracownik.podatek}")
    println(s"Pracownik-student ${pracownikStudent.imie} ${pracownikStudent.nazwisko} płaci podatek: ${pracownikStudent.podatek}")
    println(s"StudentNauczyciel ${studentNauczyciel.imie} ${pracownikStudent.nazwisko} płaci podatek: ${pracownikStudent.podatek}")
  }
}


abstract class Osoba(val newImie: String, val newNazwisko: String){
  def imie: String = newImie
  def nazwisko: String = newNazwisko
  def podatek: Double
}

trait Student extends Osoba {
  override val podatek: Double = 0
}

trait Nauczyciel extends Pracownik {
  override val podatek: Double = 0.1 * pensja
}

trait Pracownik extends Osoba {
  def pensja: Double = 1000.0
  override val podatek: Double = 0.2 * pensja
}
