import org.scalatest.FunSpec

class FizzBuzzSpec extends FunSpec {

  describe("#convert"){
    it("returns the input"){
      assert(FizzBuzz.convert(4) === 4)
    }

    it("returns 'fizz' for 3"){
      assert(FizzBuzz.convert(3) === "fizz")
    }

    it("returns 'buzz' for 5"){
      assert(FizzBuzz.convert(5) === "buzz")
    }
  }
}
