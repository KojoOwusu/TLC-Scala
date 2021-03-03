package example

trait FeePayable {def FlatFee:Double = 10.00}

trait Taxable { def TaxRate:Double = 12.5}

class Transaction(id:String,symbol:String, quantity:Int, price:Double) extends EquityTrade(id,symbol,quantity,price) with FeePayable with Taxable {

  def amount = {value + FlatFee + (TaxRate/100)*value} // amount of transaction
}
