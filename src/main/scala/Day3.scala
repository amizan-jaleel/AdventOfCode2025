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

  def maxJoltsPerBankFunctional(input: String): Long = input
    .split("\\s*\\n\\s*")
    .view
    .map(_.trim)
    .filter(_.nonEmpty)
    .map { line =>
      (0 until line.length -1)
        .view
        .map { i =>
          (i + 1 until line.length)
            .map(j => s"${line.charAt(i)}${line.charAt(j)}".toLong)
            .max
        }
        .max
    }
    .sum


  def day3(inputs: List[String]): Long =
    inputs.map(maxJoltsPerBankFunctional).sum
}
