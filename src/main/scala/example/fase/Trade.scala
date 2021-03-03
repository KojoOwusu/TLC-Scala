package example {

  package fase {

    case class Trade(id: String, symbol: String, quantity: Int, _price: Double) {
      var price: Double = {
        if (_price < 0.0) 0.0 else _price
      }
    }

  }

  abstract class Trade(val id: String, _price: Double) {
    //overloaded constructor that does take price
    var price: Double = {
      if (_price < 0.0) 0.0 else _price
    }
    def value: Double // calculate the value of the trade
    // overriding to string
    override def toString:String = {s"${this.getClass} "}   //show the type of class i guess idk

    def isExecuteable: Boolean
  }
}


  //companion object
/*  object Trade{
    def apply(id:String, symbol:String, quantity:Int, price:Double) = new Trade(id, symbol, quantity, price);
  }
}

 */






