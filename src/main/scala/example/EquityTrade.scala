package example

//equity class
class EquityTrade(id:String,val symbol:String, val quantity:Int, price:Double) extends Trade(id,price) with FeePayable with Taxable {

  override def isExecuteable: Boolean = true

  override def value: Double = quantity*price

}
