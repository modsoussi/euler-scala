package euler.problems

/** Problem 3 asks to find the largest prime factor of 600851475143 */
class Three(n: Long) extends Problem {

  def prime(n: Long): Boolean = {
    if (n == 1) return false
    
    var j = 2
    while (j*j < n) {
      if (n % j == 0) return false
      j += 1
    }

    return true
  }

  def run() {
    var largest = 2L;

    if (prime(n)) {
      println(n)
      return
    }

    var i = n;
    while (i > 1) {
      if (prime(largest) && (i % largest == 0)) {
        do {
          i /= largest
        } while (i % largest == 0)
      } else {
        largest += 1
      }
    }

    println(largest)
  }
}