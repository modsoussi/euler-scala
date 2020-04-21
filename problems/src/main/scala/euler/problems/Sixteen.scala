package euler.problems

import scala.math.BigInt

class Sixteen extends Problem {
  def run() {
    var p = BigInt(1)
    for (i <- 1 to 1000) {
      p *= BigInt(2)
    }

    println(p.toString().split("").map(d => d.toLong).sum)
  }
}