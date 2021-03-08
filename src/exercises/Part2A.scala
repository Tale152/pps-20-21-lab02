package exercises

object Part2A extends App {

  val parityLiteralSyntax: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  def parityMethodSyntax(x: Int): String = x match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  val negLiteralSyntax: (String => Boolean) => (String => Boolean) =
    (predicate: (String => Boolean)) => !predicate(_)

  def negMethodSyntax(predicate: (String => Boolean)): (String => Boolean) = !predicate(_)

  def negGeneric[A](predicate: (A => Boolean)): (A => Boolean) = !predicate(_)

}
