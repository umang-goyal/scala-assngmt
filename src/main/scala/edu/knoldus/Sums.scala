package edu.knoldus

class Sums {
  val squareFunction = (x: Int, y: Int) => x * x + y * y
  val cubeFunction = (x: Int, y: Int) => x * x * x + y * y * y
  val intFunction = (x: Int, y: Int) => x + y

  def sum(x: Int, y: Int, f: (Int, Int) => Int): Int = f(x, y)
}

