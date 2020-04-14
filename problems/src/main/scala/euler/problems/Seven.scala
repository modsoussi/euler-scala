package euler.problems

class Seven(n: Int) extends Problem {
  def prime(n: Long): Boolean = {
    if (n == 1) return false

    var i = 2;
    while (i*i <= n) {
      if (n % i == 0) return false

      i+= 1
    }

    return true
  }

  def run() {
    println(s"Prime order $n")
    var result: Long = 2

    var i = 1
    while (i < n) {
      result += 1

      if (prime(result)) {
        i+= 1
      }
    }

    println(result)
  }
}