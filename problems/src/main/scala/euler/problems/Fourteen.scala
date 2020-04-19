package euler.problems

class Fourteen extends Problem {
  def next(n: Long): Long = {
    if (n%2L == 0L) return n/2L
    return 3L*n+1L
  }

  def collatzLength(n: Int): Int = {
    var counter = 1
    var current: Long = n

    while (current != 1) {
      counter += 1
      current = next(current)
    }

    return counter
  }

  def run() {
    var max = 1
    var starting = 1
    for (i <- 2 until 1000000) {
      var length = collatzLength(i)
      if ( length > max) {
        max = length
        starting = i
      }
      
    }

    println(starting, max)
  }
}