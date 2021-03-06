package Test

import example.{FxTrade, Library, Member, Trade, Transaction}
import org.junit.{Assert, Test}

class TradeTest {

  @Test
  def testTrade={
   val t1 = new FxTrade(id = "T1", price=15.25 )

    Assert.assertTrue(t1.isInstanceOf[Trade])
    Assert.assertEquals(0.0, t1.value,0.0001)
  }

  @Test
  def testLibraryPatternMatch = {
    val BaumeLibrary = new Library;
    val Member1 = new Member("Junior")

    Assert.assertEquals(5, BaumeLibrary.borrowBooks(Member1))
  }

  @Test
  def transactionTest: Unit = {
    val t1 = new Transaction("A23", "MS", 20, 5.0)
    Assert.assertEquals(122.5,t1.amount,0.0001)
  }
}
