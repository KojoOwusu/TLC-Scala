package example

// forex class
class FxTrade(id:String, price:Double) extends Trade(id, price){

  override def isExecuteable: Boolean = false

  override def value: Double = 0.0;
}
