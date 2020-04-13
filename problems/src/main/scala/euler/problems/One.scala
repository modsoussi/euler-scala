package euler.problems

/** Problem 1 asks tp print the sum of all the multiples of 3 or 5 below 1000. */
class One extends Problem {
  def run() {
    var sum = 0

    for (i <- 1 until 1000) {
      if (i % 15 == 0) sum += i;
      else if (i % 5 == 0) sum += i;
      else if (i % 3 == 0) sum += i;
    }

    println(sum)
  }
}
