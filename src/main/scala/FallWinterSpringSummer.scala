import ChecksumAccumulator.calculate
import Rational._

object FallWinterSpringSummer extends App {
  for( season <- List("fall", "winter", "spring"))
    println(season + ":" + calculate(season))
  implicit def intToRational(x: Int) = new Rational(x)

  val a = new Rational(1,2)
  println("a: " + a)
  val b = new Rational(2,3)
  println("b: " + b)
  val c = a+b
  println("c: " + c)
  val d = a*b
  println("d: " + d)

  println(c + (d * d))

  println("2/3 * 2: " + b * 2)

  println("5 * 7/6: " + 5 * c)


}

