package exercises

import exercises.Part4._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Part4Test {

  def testShape(shape: Shape, expectedPerimeter: Double, expectedArea: Double): Unit ={
    assertEquals(expectedPerimeter, perimeter(shape))
    assertEquals(expectedArea, area(shape))
  }

  @Test def testRectangle(){
    testShape(Rectangle(3,2), 10, 6)
  }

  @Test def testCircle(){
    testShape(Circle(1), 6.28, 3.14)
  }

  @Test def testSquare(){
    testShape(Square(2), 8, 4)
  }

}
