package euler.problems

/**
 * Find the smallest positive number evenly divisible by all numbers 1-20
 */
class Five extends Problem {
  
  /**
    * returns the greatest common divisor of n and m
    *
    * @param n
    * @param m
    * @return
    */
  def gcd(n: Long, m: Long): Long = {
    var temp = n
    var a = n
    var b = m

    if (n < m) {
      a = m
      b = n
    }

    while (a % b != 0L) {
      temp = a
      a = b
      b = temp % b
    }

    return b
  }
  
  /**
    * Returns the least common multiple of n and m
    *
    * @param n,m
    * @return least common multiple of n and m
    */
  def lcm(n: Long, m: Long): Long = {
    return n * m / gcd(n, m)
  }

  def run() {
    var lot = 1L
    for (i <- 2L to 20L) {
      lot = lcm(lot, i)
    }

    println(lot)
  }
}