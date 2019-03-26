import org.scalatest.FunSpec

class FizzBuzzSpec extends FunSpec {

  describe("#convert"){
    it("returns the input"){
      assert(FizzBuzz.convert(4) === 4)
    }

    it("returns 'fizz' for 3"){
      assert(FizzBuzz.convert(3) === "fizz")
    }

    it("returns 'fizz' for a multiple of 3"){
      assert(FizzBuzz.convert(6) === "fizz")
    }

    it("returns 'buzz' for 5"){
      assert(FizzBuzz.convert(5) === "buzz")
    }

    it("returns 'buzz' for a multiple of 5"){
      assert(FizzBuzz.convert(10) === "buzz")
    }
  }
}
