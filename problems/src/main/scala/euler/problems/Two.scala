package euler.problems

/**
 * Problem 2 asks to find the sum of all even fibonaccis below 4 million
 */
class Two extends Problem {
  val _bound = 4000000

  def run() {
    var x = 1
    var y = 2
    var sum = 0
    var temp = 0;

    while (y < _bound) {
      if (y % 2 == 0) {
        sum += y
      }

      temp = x
      x = y
      y += temp
    }

    println(sum)
  }
}