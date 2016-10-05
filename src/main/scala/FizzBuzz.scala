/**
  * Created by nattpornc on 5/10/2559.
  */
object FizzBuzz {
  def getResult(number: Int): String = (number % 3 == 0, number % 5 == 0) match {
    case (true, true) => "fizzbuzz"
    case (false, true) => "buzz"
    case (true, false) => "fizz"
    case _ => number.toString
  }
}

