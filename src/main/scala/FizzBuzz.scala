object FizzBuzz extends App {
  def convert(x: Int) = {
    var result = ""

    if (x % 3 == 0) { result += "fizz" }
    if (x % 5 == 0) { result += "buzz" }
    if (result == "") { result = x.toString }

    result
  }
}
