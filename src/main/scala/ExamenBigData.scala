import scala.collection.immutable._
object ExamenBigData {

  def newList(liste : List[String]) : List[String] = {
    val newList1 = liste.filter(x => ( x.charAt(x.length -1) == 'n') )
    return newList1
  }

  def liste_double() : Unit = {
    // ma liste de tuple
    /*
    val monMap: Map[String, String] = Map(
      "ecommerce.fr" -> "",
      "https://www.journalducm.com/contact/" -> "Payant",
      "https://www.zatsaz.com/" -> "",
      "https://www.lerevenu.com/" -> "",
      "https://www.cadre-dirigfdeant-magazine.com" -> "Payant",
      "https://www.silicon.fr/services/contact#annoncer" -> "Payant",
      "https://www.channelbiz.fr/nous-contacter/" -> "",
      "https://www.itspresso.fr/" -> "",
      "https://www.industrie-mag.com/article4.html" -> "invité",
      "https://www.jesuisundev.com/article-invite/" -> "invité",
      "https://www.numerama.com/" -> ""

    )
    val liste1 = monMap.toList
    //println(liste1)
    val listeOffHttp = monMap.keys
    val L2 = listeOffHttp.foreach(x => x.substring(12))
    //println(listeOffHttp)

     */
    val liste : List
  }

  def main(args: Array[String]): Unit = {
    val testList = List("julien", "Paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")
    val test = newList(testList)
    println(test)
    liste_double()
  }
}














