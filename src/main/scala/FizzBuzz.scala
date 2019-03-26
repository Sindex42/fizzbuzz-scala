object FizzBuzz extends App {
  def convert(x: Int) = {
    if(x == 3){
      "fizz"
    } else if(x == 5){
      "buzz"
    } else{
      x
    }
  }
}
