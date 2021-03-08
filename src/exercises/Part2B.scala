package exercises

object Part2B extends App {

  def checkCurriedDef[A](predicate: ((A, A, A) => Boolean))(x: A, y: A, z: A): Boolean = predicate(x, y, z)

  val checkCurriedVal: ((Int, Int, Int) => Boolean) => (Int, Int, Int) => Boolean =
    (predicate: ((Int, Int, Int) => Boolean)) => predicate(_, _, _)

  def checkNonCurriedDef(x: Int, y: Int, z: Int): Boolean = x <= y && y <= z

  val checkNonCurriedVal = (x: Int, y: Int, z: Int) => x <= y && y <= z

  def compose[A, B, C](f: B => C, g: A => B)(x: A): C = f(g(x))

}
