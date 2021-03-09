package exercises

import scala.annotation.tailrec

object Part3 extends App{

  @tailrec def fibStep(nMinusOne: Int, nMinusTwo: Int):Int = nMinusOne match{
    case 1 => 1
    case _ => fibStep(nMinusTwo, nMinusTwo - 1)
  }

  def fib(n: Int): Int = n match {
    case n if n < 0 => throw new ArithmeticException("fib does not accept negative values")
    case 0 | 1 => n
    case _ => fibStep(n-1, n-2)
  }

}
