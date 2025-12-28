import org.specs2.mutable.Specification
import Day3._

class Day3Test extends Specification {
  "Day3Test" should {
    "pass part 1" in {
      "the example case" >> {
        val input =
          scala.io.Source
            .fromResource("day03simple.txt")
            .getLines().toList
        day3(input) must_== 357
      }

      "the test input" >> {
        val input =
          scala.io.Source
            .fromResource("day03input.txt")
            .getLines().toList
        day3(input) must_== 17100
      }
    }
  }
}
