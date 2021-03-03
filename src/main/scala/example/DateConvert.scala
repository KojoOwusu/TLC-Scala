package example

object DateConvert {
  def apply(d: String):String = {
      //date regular expression
      val dateString = "([0-9]+)/([0-9]+)/([0-9]+)".r
      var dateString(day,month, year) = d;
      val monString:String = month match {
        case "01" => "January"
        case "02" => "February"
        case "03" => "March"
        case "04" => "April"
      }
      s"${day}${day match{ case "1"|"21"|"31" => "st"; case "2"|"22"=> "nd"; case "3"|"23"=> "rd"; case _ => "th"}} ${monString} 20${year}"
  }
}
