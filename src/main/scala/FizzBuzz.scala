object FizzBuzz extends App {
  def convert(x: Int) = {
    if(x % 3 == 0){
      "fizz"
    } else if(x % 5 == 0){
      "buzz"
    } else{
      x
    }
  }
}
