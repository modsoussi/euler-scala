package euler.problems

/**
  * Asks to find how may paths to the bottom right corner of a (n x n) grid, starting at the
  * top left corner, and only moving down or to the right.
  *
  * @param n
  */
class Fifteen(n: Int) extends Problem {
  var numPaths: Long = 0

  def traverse(i: Int, j: Int) {
    if (i == n && j == n) {
      numPaths += 1
      return
    }

    if (i < n) traverse(i+1, j)
    if (j < n) traverse(i, j+1)
  }

  def run() {
    traverse(0, 0)

    println(numPaths)
  }
}