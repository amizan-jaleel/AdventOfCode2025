import org.specs2.mutable.Specification

import Day1._

class Day1Test extends Specification {
  "Day1Test" should {
    "pass part 1" in {
      "the example case" >> {
        val input = scala.io.Source.fromResource("day01simple.txt")
        val rotations: List[Rotation] = input.getLines().map { line =>
          val direction = line.charAt(0) match {
            case 'R' => Day1.Right
            case 'L' => Day1.Left
          }

          Rotation(
            direction=direction,
            num=line.substring(1).toInt,
          )
        }.toList
        Day1.getPassword(rotations) must_== 3
      }

      "the test input" >> {
        val input = scala.io.Source.fromResource("day01input.txt")
        val rotations: List[Rotation] = input.getLines().map { line =>
          val direction = line.charAt(0) match {
            case 'R' => Day1.Right
            case 'L' => Day1.Left
          }

          Rotation(
            direction=direction,
            num=line.substring(1).toInt,
          )
        }.toList
        Day1.getPassword(rotations) must_== 1180
      }
    }
  }
}
