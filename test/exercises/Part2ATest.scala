package exercises

import exercises.Part2A._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Part2ATest {

  @Test def testParity(){
    for(i <- 0 until 100){
      i % 2 match {
        case 0 => assertEquals("even", parityMethodSyntax(i))
        case _ => assertEquals("odd", parityMethodSyntax(i))
      }
    }
  }

  @Test def testNeg(){
    val isStringEmpty: String => Boolean = _ == ""
    val notStringEmpty = negMethodSyntax(isStringEmpty)
    assertTrue(notStringEmpty("test"));
    assertFalse(notStringEmpty(""))
  }

  @Test def testNegGeneric(): Unit ={
    val isStringEmpty: String => Boolean = _ == ""
    val notStringEmpty = negGeneric(isStringEmpty)
    assertTrue(notStringEmpty("test"));
    assertFalse(notStringEmpty(""))

    val isGreaterThanZero: Int => Boolean = _ > 0
    val notGreaterThanZero = negGeneric(isGreaterThanZero)
    assertTrue(notGreaterThanZero(-1))
    assertTrue(notGreaterThanZero(0))
    assertFalse(notGreaterThanZero(1))
  }


}
