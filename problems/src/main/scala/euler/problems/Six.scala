package euler.problems

/** Problem six asks for the difference between sum of first 100
 * numbers squared and the square of the sum of the first 100 digits
 */
class Six extends Problem {
  def run() {
    var sumOfSquares = 0
    var squareOfSum = 0

    for (i <- 1 to 100) {
      sumOfSquares += i*i
      squareOfSum += i
    }

    println(squareOfSum*squareOfSum - sumOfSquares)
  }
}