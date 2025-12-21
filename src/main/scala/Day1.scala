object Day1 {
  sealed trait Direction
  case object Left extends Direction
  case object Right extends Direction
  case class Rotation(
    direction: Direction,
    num: Int,
  )

  def getPassword(rotations: List[Rotation]): Int = rotations.foldLeft(50, 0) {
    case((cur, count), rot) =>
      val direction = rot.direction
      val jump = direction match {
        case Left => rot.num * -1
        case Right => rot.num
      }

      val res = (cur + jump) % 100
      res match {
        case 0 => (res, count + 1)
        case _ => (res, count)
      }
  }._2
}
