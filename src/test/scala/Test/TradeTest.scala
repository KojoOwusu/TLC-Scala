package Test

import example.{FxTrade, Trade}
import org.junit.{Assert, Test}

class TradeTest {

  @Test
  def testTrade={
   val t1 = new FxTrade(id = "T1", price=15.25 )

    Assert.assertTrue(t1.isInstanceOf[Trade])
    Assert.assertEquals(0.0, t1.value,0.0001)

  }
}
