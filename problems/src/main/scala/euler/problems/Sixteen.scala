package euler.problems

class Sixteen extends Problem {
  def run() {
    var p = 1L
    for (i <- 1 to 1000) {
      p *= 2L
      println(s"2^$i=$p")
    }

    println(p.toString().split("").map(d => d.toLong).sum)
  }
}