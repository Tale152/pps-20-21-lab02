package exercises

object Part3 extends App{

  def fib(n: Int): Int = n match {
    case n if n < 0 => throw new ArithmeticException("fib does not accept negative values")
    case 0 | 1 => n
    case _ => n + fib(n - 1)
  }

}
