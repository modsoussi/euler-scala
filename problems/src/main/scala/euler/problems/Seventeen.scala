package euler.problems

class Seventeen extends Problem {
  def toNumberString(n: Int): String = {
    n match {
      case x if 1 to 9 contains x => {
        x match {
          case 0 => return ""
          case 1 => return "one"
          case 2 => return "two"
          case 3 => return "three"
          case 4 => return "four"
          case 5 => return "five"
          case 6 => return "six"
          case 7 => return "seven"
          case 8 => return "eight"
          case 9 => return "nine"
        }
      }
      case 10 => return "ten"
      case 11 => return "eleven"
      case 12 => return "twelve"
      case 13 => return "thirteen"
      case 14 => return "fourteen"
      case 15 => return "fifteen"
      case 16 => return "sixteen"
      case 17 => return "seventeen"
      case 18 => return "eighteen"
      case 19 => return "nineteen"
      case x if 20 to 29 contains x => {
        if (x == 20) return "twenty"
        return s"twenty${toNumberString(x%10)}"
      }
      case x if 30 to 39 contains x => {
        if (x == 30) return "thirty"
        return s"thirty${toNumberString(x%10)}"
      }
      case x if 40 to 49 contains x => {
        if (x == 40) return "forty"
        return s"forty${toNumberString(x%10)}"
      }
      case x if 50 to 59 contains x => {
        if (x == 50) return "fifty"
        return s"fifty${toNumberString(x%10)}"
      }
      case x if 60 to 69 contains x => {
        if (x == 60) return "sixty"
        return s"sixty${toNumberString(x%10)}"
      }
      case x if 70 to 79 contains x => {
        if (x == 70) return "seventy"
        return s"seventy${toNumberString(x%10)}"
      }
      case x if 80 to 89 contains x => {
        if (x == 80) return "eighty"
        return s"eighty${toNumberString(x%10)}"
      }
      case x if 90 to 99 contains x => {
        if (x == 90) return "ninety"
        return s"ninety${toNumberString(x%10)}"
      }
      case x if 100 to 999 contains x => {
        if (x%100 == 0) return s"${toNumberString(x/100)}hundred"
        return s"${toNumberString(x/100)}hundredand${toNumberString(x%100)}"
      }
      case 1000 => return "onethousand"
    }
  }

  def run() {
    var sum = 0
    for (i <- 1 to 1000) {
      sum += toNumberString(i).length()
    }

    println(sum)
  }
}