package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Ex2Test {

  import Ex2.Neg.negGeneric

  @Test def testNotGeneric() {
    assertTrue(negGeneric((x: String) =>  x =="")("test string"))
  }


}
