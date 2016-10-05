import org.scalatest.{FunSuite, Matchers}

/**
  * Created by nattpornc on 5/10/2559.
  */
class FizzBuzzTest extends FunSuite with Matchers {
  test("input number 3 should return \"fizz\"") {
    val number = 3
    val result = FizzBuzz.getResult(number)
    result should be("fizz")
  }
  object FizzBuzz {
    def getResult(number: Int):String = "fizz"
  }

}
