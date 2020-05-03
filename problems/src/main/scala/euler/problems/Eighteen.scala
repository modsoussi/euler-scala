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
        print(f"${_g(i)(j)}%4d ")
      }
      println
    }
    println
  }

  def run() {
    _parse()
    _print()

    for (i <- 1 until _size) {
      for (j <- 0 to i) {
        _g(i)(j) = j match {
          case 0 => _g(i)(j) + _g(i-1)(j)
          case x if x == i => _g(i)(j) + _g(i-1)(j-1)
          case _ => Math.max(_g(i)(j) + _g(i-1)(j-1), _g(i)(j) + _g(i-1)(j))
        }
      }
    }

    _print()
    println(_g(_size-1).max)
  }
}