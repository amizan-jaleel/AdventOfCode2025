import scala.collection.immutable.NumericRange

object Day2 {
  def invalid(id: Long): Boolean = {
    val s = id.toString
    val (firstHalf, secondHalf) = s.splitAt(s.length / 2)
    firstHalf == secondHalf
  }

  def day2(ranges: List[NumericRange.Inclusive[Long]]): Long = {
    ranges.iterator.flatten.filter(invalid).sum
  }
}
