package euler.problems

class Eighteen(t: String) extends Problem {
  val _split = t.split("\n")
  val _size = _split.length
  val _g = Array.ofDim[Long](_size, _size)

  def _parse() {
    for (i <- 0 until _size) {
      var __split = _split(i).split(" ").map(e => e.toLong)
      for (j <- 0 to i) {
        _g(i)(j) = __split(j)
      }
    }
  }

  def _print() {
    for (i <- 0 until _size) {
      for (j <- 0 until _size) {
        print(f"${_g(i)(j)}%2d ")
      }
      println
    }
  }

  def run() {
    _parse()
    _print()
  }
}