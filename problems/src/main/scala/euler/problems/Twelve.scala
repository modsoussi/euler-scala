package euler.problems

class Twelve() extends Problem {
  def factors(n: Int): Int = {
    var i = 2
    var factors = 2

    while (i*i < n) {
      if (n % i == 0) {
        factors += 2
      }

      i += 1
    }

    if (i*i == n) factors += 1  

    return factors
  }

  def run() {
    var found = false
    var n = 1
    var sum = 1

    while(factors(sum) <= 500) {
      n += 1
      sum += n
    }

    println(n, sum)
  }
}