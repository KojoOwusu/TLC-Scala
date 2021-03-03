package example
import example.fase.Trade

object Main extends App{

      val fahrenheit = ToFah(25.5)
      //print(f"$fahrenheit%.2f degrees Fah\n\n");
      //println(DateConvert("23/04/24"));

      //val t1 = new Trade(id = "T1",quantity = 100,symbol = "APPL",_price = -15.25 )

      val t2 = example.fase.Trade("T1","APPL",100,24.2);   //case class

      println(t2)
     // val t3 = Trade("T1","APPL",100,24.2)

  }
