package example

trait FeePayable {def getFlatFee:Double = 10.00}

trait Taxable { def getTaxRate:Double = 12.5}

class Transaction(id:String,symbol:String, quantity:Int, price:Double) extends EquityTrade(id,symbol,quantity,price){

  def amount = {value + getFlatFee + (getTaxRate/100)*value} // 10+value+12.5% of value
}
