package edu.knoldus

import org.scalatest.FunSuite

class SumsTest extends FunSuite {

  val x = new Sums

  test("test for sum of square") {
    x.sum(2,5, x.squareFunction)
  }

  test("test for sum of cubes") {
    x.sum(2,2, x.cubeFunction)
  }

  test("test for sum integers") {
    x.sum(2,2, x.intFunction)
  }
  
}
