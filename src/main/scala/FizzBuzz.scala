/**
  * Created by nattpornc on 5/10/2559.
  */
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

