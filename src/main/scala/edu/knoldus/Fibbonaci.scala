package edu.knoldus

class Fibbonaci {

  def fib(limit: Int): Array[Int] = {
    @scala.annotation.tailrec
    def fibTailRec(x: Int, array: Array[Int], limit: Int): Array[Int] = {
      if (x == limit) {
        return array
      }

      array(x) = array(x - 1) + array(x - 2)
      fibTailRec(x + 1, array, limit)
    }

    val arr: Array[Int] = new Array[Int](limit)
    try {
      if (limit == 1) {
        return arr
      }
      arr(1) = 1
      fibTailRec(2, arr, limit)
    }
    catch {
      case exception: java.lang.ArrayIndexOutOfBoundsException =>
        print("Input an positive integer. ")
        arr
    }
  }
}



