package euler.problems
import java.time._

/**
  * n adjacent digits with largest product, return product
  *
  * @param s - number is entered as a string
  * @param n - number of adjcent digits we're looking for
  */
class Eight(s: String, n: Int) extends Problem {
  def run() {
    var i = 0
    var l = s.length()
    var div: Long = 1
    var mult: Long = 1

    // initialize largest to take the value of the first n digits of s
    var sequence = s.substring(0, n)
    var current = sequence.split("").map(c => c.toLong).reduce((x, y) => x*y)
    var clargest = current

    var start = OffsetDateTime.now().toInstant().toEpochMilli();
    while (i + n < l) {
      i+=1 // looking at substring that starts at i+1

      val seq = s.substring(i, i + n)

      current = seq.split("").map(c => c.toLong).reduce((x, y) => x*y)
      if (current > clargest) {
        clargest = current
        sequence = seq
      }
    }

    println(s"Running time: ${
      OffsetDateTime.now().toInstant().toEpochMilli() - start
    }ms")
    println(s"Largest product is: $clargest")
    println(s"The corresponding $n-digit sequence is: $sequence")
  }
}

class EightOptimized(s: String, n: Int) extends Problem {
  def run() {
    var i = 0
    var l = s.length()
    var div: Long = 1
    var mult: Long = 1

    // initialize largest to take the value of the first n digits of s
    var sequence = s.substring(0, n)
    var current = sequence.split("").map(c => c.toLong).reduce((x, y) => x*y)
    var clargest = current

    var start = OffsetDateTime.now().toInstant().toEpochMilli();
    while (i + n < l) {
      i+=1 // looking at substring that starts at i+1

      val seq = s.substring(i, i + n)

      div = s.charAt(i - 1).toString.toLong
      mult = s.charAt(i + n - 1).toString.toLong

      if (div == 0) {
        current = seq.split("").map(c => c.toLong).reduce((x, y) => x*y)
      } else {     
        current = current * mult / div
      }

      if (current > clargest) {
        clargest = current
        sequence = seq
      }
    }

    println(s"Running time: ${
      OffsetDateTime.now().toInstant().toEpochMilli() - start
    }ms")
    println(s"Largest product is: $clargest")
    println(s"The corresponding $n-digit sequence is: $sequence")
  }
}
