package exercises

object Part5 extends App{

  sealed trait Option[A]
  object Option {
    case class None[A]() extends Option[A]
    case class Some[A](a: A) extends Option[A]

    def isEmpty[A](opt: Option[A]): Boolean = opt match {
      case None() => true
      case _ => false
    }

    def getOrElse[A, B >: A](opt: Option[A], orElse: B): B = opt match {
      case Some(a) => a
      case _ => orElse
    }

    def flatMap[A,B](opt: Option[A])(f:A => Option[B]): Option[B] = opt match {
      case Some(a) => f(a)
      case _ => None()
    }

    def filter[A](opt: Option[A])(predicate: Option[A] => Boolean): Option[A] = isEmpty(opt) match {
      case false if predicate(opt) => opt
      case _ => None[A]()
    }

    def map[A](opt: Option[A])(predicate: Option[A] => Boolean): Option[Boolean] = isEmpty(opt) match {
      case false => Some[Boolean](predicate(opt))
      case _ => None[Boolean]()
    }

    def map2[A](opt1: Option[A], opt2: Option[A])(predicate: (Option[A], Option[A]) => Option[A]):Option[A] = isEmpty(opt1) match {
      case false if !isEmpty(opt2) => predicate(opt1, opt2)
      case _ => None[A]()
    }

  }

  import Option._
  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = None()

  println(s1) // Some(1)
  println(getOrElse(s1,0), getOrElse(s3,0)) // 1,0
  println(flatMap(s1)(i => Some(i+1))) // Some(2)
  println(flatMap(s1)(i => flatMap(s2)(j => Some(i+j)))) // Some(3)
  println(flatMap(s1)(i => flatMap(s3)(j => Some(i+j)))) // None

}
