package exercises

import exercises.Part3._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Part3Test {

  @Test def testFibNegatives(){
    try{
      fib(-1)
      fail("fib can't accept negative values")
    } catch {
      case neg: ArithmeticException => println("test passed")
    }
  }

  @Test def testFib(){
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(8, fib(6))
  }

}
