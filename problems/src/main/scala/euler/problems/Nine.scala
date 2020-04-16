package euler.problems

/**
  * Nine asks to find the product of a,b, and c, where a^2 + b^2 = c^2 and 
  * a + b + c = n
  */
class Nine(n: Int) extends Problem {
  def square(n: Int) = n*n

  def run() {
    var a = 1
    var b = 1
    var c = 1

    var found = false
    while (a < n && !found) {
      while (b < n && !found) {
        while (c < n && !found) {
          if (square(a) + square(b) == square(c) && a + b + c == n) {
            found = true
          } else {
            c += 1
          }
        }

        if (!found) {
          b += 1
          c = 1
        }
      }

      if (!found) {
        a += 1
        b = 1
        c = 1
      }
    }

    println(s"found=$found, a=$a, b=$b, c=$c, prod=${a*b*c}")
  }
}