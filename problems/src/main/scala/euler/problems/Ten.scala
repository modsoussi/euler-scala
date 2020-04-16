package euler.problems

/**
  * problem ten asks to find the sum of all primes below n
  *
  * @param n
  */
class Ten(n: Int) extends Problem {
  def prime(n: Int): Boolean = {
    if (n == 1) return false

    var i = 2
    while (i*i <= n) {
      if (n % i == 0) {
        return false
      }

      i += 1
    }

    return true
  }
  
  def run() {
    var sum: Long = 0

    for (i <- 1 to n) {
      if (prime(i)) {
        sum += i
      }
    }

    println(s"The sum ofll primes below $n is: $sum")
  }
}