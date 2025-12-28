object Day3 {
  def maxJoltsPerBank(input: String): Long = {
    var curMax: Long = 0L
    val l = input.length
    for {
      i <- 0 until l - 1
      j <- i + 1 until l
    } {
      val thisNum: Long = s"${input.charAt(i)}${input.charAt(j)}".toLong
      if (thisNum > curMax) curMax = thisNum
    }
    curMax
  }

  def day3(inputs: List[String]): Long =
    inputs.map(maxJoltsPerBank).sum
}
