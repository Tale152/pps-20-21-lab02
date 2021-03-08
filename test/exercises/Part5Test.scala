package exercises

import exercises.Part5.Option._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Part5Test {

  var greaterThanZeroPredicate = (x: Part5.Option[Int]) => getOrElse(x, 0) > 0

  @Test def testFilter(){
    assertEquals(Some(5), filter(Some(5))(greaterThanZeroPredicate))
    assertEquals(None[Int](), filter(Some(0))(greaterThanZeroPredicate))
    assertEquals(None[Int](), filter(None[Int]())(greaterThanZeroPredicate))
  }

  @Test def testMap(){
    assertEquals(Some(true), map(Some(5))(greaterThanZeroPredicate))
    assertEquals(Some(false), map(Some(0))(greaterThanZeroPredicate))
    assertEquals(None[Int](), map(None[Int]())(greaterThanZeroPredicate))
  }

  @Test def testMap2(){
    val sumPredicate = (x: Part5.Option[Int], y: Part5.Option[Int]) =>
      Some(getOrElse(x, 0) + getOrElse(y, 0))

    assertEquals(Some(7), map2(Some(5), Some(2))(sumPredicate))
    assertEquals(None[Int](), map2(None[Int](), Some(2))(sumPredicate))
    assertEquals(None[Int](), map2(Some(5), None[Int]())(sumPredicate))

  }

}
