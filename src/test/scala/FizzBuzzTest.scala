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
  test("input number 5 should return \"buzz\"") {
    val number = 5
    val result = FizzBuzz.getResult(number)
    result should    be("buzz")
  }
  test("input number 1 should return same value") {
    val number = 1
    val result = FizzBuzz.getResult(number)
    result should  be("1")
  }
  test("input number 6 should return \"fizz\"") {
    val number = 6
    val result = FizzBuzz.getResult(number)
    result should  be("fizz")
  }
  test("input number 7 should return \"7\"") {
    val number = 7
    val result = FizzBuzz.getResult(number)
    result should  be("7")
  }
  test("input number 9 should return \"fizz\"") {
    val number = 9
    val result = FizzBuzz.getResult(number)
    result should  be("fizz")
  }
  test("input number 10 should return \"buzz\"") {
    val number = 10
    val result = FizzBuzz.getResult(number)
    result should  be("buzz")
  }
  test("input number 11 should return \"11\"") {

    val number = 11
    val result = FizzBuzz.getResult(number)
    result should  be("11")
  }
  test("input number 15 should return \"fizzbuzz\"") {

    val number = 15
    val result = FizzBuzz.getResult(number)
    result should  be("fizzbuzz")
  }
  object FizzBuzz {
    def getResult(number: Int):String = {
      if( number % 3 == 0 && number % 5 == 0){
        return "fizzbuzz"
      }
      if(number % 5 == 0) {
        return "buzz"
      }

      if(number % 3 == 0) {
        return "fizz"
      }
      number.toString
    }
  }

}
