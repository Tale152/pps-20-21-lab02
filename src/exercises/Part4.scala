package exercises

object Part4 extends App{

  sealed trait Shape
  case class Rectangle(base: Double, height: Double) extends Shape
  case class Circle(radius: Double) extends Shape
  case class Square(side: Double) extends Shape

  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(b,h) => (b * 2) + (h * 2)
    case Circle(r) => r * 2 * 3.14
    case Square(s) => s * 4
  }

  def area(shape: Shape): Double = shape match {
    case Rectangle(b,h) => b * h
    case Circle(r) => r * r * 3.14
    case Square(s) => s * s
  }

}
