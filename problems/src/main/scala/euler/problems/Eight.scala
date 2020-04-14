package euler.problems

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
    var div = 1
    var mult = 1

    // initialize largest to take the value of the first n digits of s
    var sequence = s.substring(0, n)
    var current = sequence.split("").map(c => c.toInt).reduce((x, y) => x*y)
    var clargest = current

    while (i + n < l) {
      i+=1 // looking at substring that starts at i+1

      val seq = s.substring(i, i + n)
      // println(s"Looking at sequence $seq")

      // div = s.charAt(i - 1).toString.toInt
      // mult = s.charAt(i + n - 1).toString.toInt

      // if (div == 0) {
      //   current = seq.split("").map(c => c.toInt).reduce((x, y) => x*y)
      // } else {     
      //   current = current * mult / div
      // }

      current = seq.split("").map(c => c.toInt).reduce((x, y) => x*y)
      if (current > clargest) {
        clargest = current
        sequence = seq
      }
    }

    println(clargest)
    println(sequence)
  }
}