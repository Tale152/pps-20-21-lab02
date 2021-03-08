package u02

import u02.Ex2.Neg.negGeneric

object Ex2 extends App{

  val parityLiteralSyntax: Int => String =
    (x: Int) => x match {
      case n if n % 2 == 0 => "even"
      case _ => "odd"
  }

  def parityMethodSyntax(x: Int): String = x match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  println(parityLiteralSyntax(2))
  println(parityLiteralSyntax(1))
  println(parityMethodSyntax(2))
  println(parityMethodSyntax(1))

  val negLiteralSyntax: (String => Boolean) => (String => Boolean) =
    (predicate: (String => Boolean)) => !predicate(_)

  def negMethodSyntax(predicate: (String => Boolean)): (String => Boolean) = {
    !predicate(_)
  }

  val empty: String => Boolean = _==""
  val notEmptyLiteralSyntax = negLiteralSyntax(empty)
  val notEmptyMethodSyntax = negMethodSyntax(empty)

  println(notEmptyLiteralSyntax("return true"))
  println(notEmptyMethodSyntax("return true"))

  sealed trait Neg[A]
  object Neg{
    def negGeneric[A](predicate: (A => Boolean)): (A => Boolean) = {
      !predicate(_)
    }
  }

  val notEmptyGeneric = negGeneric(empty)
  println(notEmptyGeneric("return true"))

}
