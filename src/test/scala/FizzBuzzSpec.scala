import org.scalatest.FunSpec

class FizzBuzzSpec extends FunSpec {

  describe("#convert") {
    it("returns a number") {
      assert(FizzBuzz.convert(1) === 1)
    }
  }
}
