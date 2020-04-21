package euler.problems

/**
  * Asks to find how may paths to the bottom right corner of a (n x n) grid, starting at the
  * top left corner, and only moving down or to the right.
  *
  * @param n
  */
class Fifteen(n: Int) extends Problem {
  val _g = Array.ofDim[Long](n+1, n+1)
  var numPaths: Long = 0

  /**
    * O(2^(n^2))
    *
    * @param i
    * @param j
    */
  def slowTraverse(i: Int, j: Int) {
    if (i == n && j == n) {
      numPaths += 1L
      return
    }

    if (i < n) slowTraverse(i+1, j)
    if (j < n) slowTraverse(i, j+1)
  }

  def traverse() {
    _g(0)(0) = 0
    for (i <- 1 to n) {
      _g(0)(i) = 1
      _g(i)(0) = 1
    }

    for (k <- 1 to n) {
      for (l <- 1 to n) {
        _g(k)(l) = _g(k)(l-1) + _g(k-1)(l)
      }
    }
  }

  def run() {
    traverse()

    println(_g(n)(n))
  }
}