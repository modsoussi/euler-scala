package euler.problems

import scala.annotation.switch

class Eleven(grid: String, n: Int) extends Problem {
  private val _g = grid.split("\n").map(row => row.split(" ").map(e => e.toLong))
  private val nrows = _g.length
  private val ncols = _g(0).length
  private val _pg = Array.ofDim[Long](nrows, ncols)

  /**
    * Returns the maxiumum product of n adjacent numbers in the same direction
    * at (i,j)
    *
    * @param i - row index
    * @param j - column index
    * @return
    */
  def maximumProductAt(i: Int, j: Int): Long = {
    var h: Long = 1 // horizontal
    var v: Long = 1 // vertical
    var du: Long = 1 // diagonal right going up
    var dd: Long = 1 // diagonal right going down

    // counters
    var k = 0
    var l = 0
    
    // horizontal 
    if (j+n-1 < ncols) {
      for (k <- j until j+n) { h *= _g(i)(k) } 
    }

    // diagonal right going down
    if (j+n-1 < ncols && i+n-1 < nrows) {
      l = i
      k = j
      while (k < j+n && l < i+n) {
        dd *= _g(l)(k)
        l += 1
        k += 1
      }
    }

    // diagonal right going up
    if (i-n+1 > 0 && j+n-1 < ncols) {
      l = i-n
      k = j+n-1
      while (k >= j && l < i) {
        du *= _g(l)(k)
        l += 1
        k -= 1
      }
    }

    // vertical
    if (i+n-1 < nrows) {
      for (l <- i until i+n) { v *= _g(l)(j) } 
    }

    return List(h,v,du,dd).max
  }

  def _compute() {
    for (i <- 0 until _g.length) {
      for (j <- 0 until _g(i).length) {
        _pg(i)(j) = maximumProductAt(i, j)
      }
    }
  }

  def _gridPrint() {
    for (i <- 0 until _g.length) {
      for (j <- 0 until _g(i).length) {
        print(f"${_g(i)(j)}%2d ")
      }
      println
    }
    println
  }

  def run() {
    _gridPrint()
    _compute()
    
    println(_pg.flatten.max)
  }
}