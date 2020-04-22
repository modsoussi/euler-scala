package euler.problems

class Seventeen extends Problem {
  def getUnitNumberString(n: Int): String = {
    n match {
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

  def getTensNumberString(n: Int): String = {
    n match {
      case 2 => return "twenty"
      case 3 => return "thirty"
      case 4 => return "fourty"
      case 5 => return "fifty"
      case 6 => return "sixty"
      case 7 => return "seventy"
      case 8 => return "eighty"
      case 9 => return "ninety"
    }
  }

  def toNumberString(n: Int): String = {
    n match {
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
      case 1000 => return "one thousand"
      case _ => {
        var hundreds = n / 100
        var tens = (n % 100) / 10
        var units = n % 10
        println(hundreds, tens, units)

        var hundredsString = ""
        if (hundreds > 0) {
          hundredsString = s"${} hundred"
        }

        var result = getUnitNumberString(units)
        if (tens > 0){
          result = s"${getTensNumberString(tens)}-$result"
        }

        if (hundreds > 0) {
          var temp = s"${getUnitNumberString(hundreds)} hundred"
          if (result.length() > 0) {
            result = s"and $result"
          }

          result = s"$temp $result"
        }

        return result
      }
    }
  }

  def run() {
    println(toNumberString(111))
  }
}