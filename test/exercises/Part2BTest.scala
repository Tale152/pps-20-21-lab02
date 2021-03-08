package exercises

import exercises.Part2B._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Part2BTest {

  @Test def testCheckCurried(){
    val intPredicate = (x: Int, y: Int, z: Int) => x <= y && y <= z
    assertTrue(checkCurriedDef(intPredicate)(1,2,3))
    assertFalse(checkCurriedDef(intPredicate)(3,2,1))
  }

  @Test def testCheckNonCurried(){
    assertTrue(checkNonCurriedDef(1,2,3))
    assertFalse(checkNonCurriedDef(3,2,1))
  }

  @Test def testCompose(){
    assertEquals(9, compose[Int, Int, Int](_ - 1, _ * 2)(5))
    assertEquals("test", compose[String, String, String](_ + "t", _ + "s")("te"))
    assertEquals(1.2, compose[Int, String, Double](_.toDouble, _.toString + ".2")(1))
  }

}
