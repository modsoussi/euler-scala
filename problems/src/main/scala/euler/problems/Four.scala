package euler.problems

/**
 * Problem 4 asks for the largest palindrome made from the product of two
 * 3-digit numbers.
 */
class Four extends Problem {
  def palindrome(p: Int): Boolean = {
    val s = p.toString
    var i = 0
    var j = s.length() - 1

    while (i<j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false
      }

      i+=1
      j-=1
    }

    return true
  }

  def run() {
    var largest = 101

    for (i <- 100 to 999) {
      for (j <- 100 to 999) {
        var product = i*j
        if (palindrome(product) && product > largest) {
          largest = product
        }
      }
    }

    println(largest)
  }
}