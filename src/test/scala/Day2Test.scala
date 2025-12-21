import org.specs2.mutable.Specification
import Day2._

import scala.collection.immutable.NumericRange

class Day2Test extends Specification {
  "Day2Test" should {
    "pass part 1" in {
      "the example case" >> {
        val input =
          scala.io.Source
            .fromResource("day02simple.txt")
            .getLines()
            .toList.head
        val ranges: List[NumericRange.Inclusive[Long]] = input.split(",").map { s =>
          val parts = s.split("-")
          val begin = parts(0).toLong
          val end = parts(1).toLong
          begin to end
        }.toList

        day2(ranges) must_== 1227775554
      }

      "the test input" >> {
        val input =
          scala.io.Source
            .fromResource("day02input.txt")
            .getLines()
            .toList.head
        val ranges: List[NumericRange.Inclusive[Long]] = input.split(",").map { s =>
          val parts = s.split("-")
          val begin = parts(0).toLong
          val end = parts(1).toLong
          begin to end
        }.toList
        day2(ranges) must_== 29940924880L
      }
    }
  }
}
