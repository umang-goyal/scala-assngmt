package edu.knoldus

import org.scalatest.FunSuite

class AreaOfShapesTest extends FunSuite {

  val shape = new AreaOfShapes

  test("area when shape is rectangle") {
    shape.area ("rectangle", 5, 2)
  }

  test("area when shape is parallelogram") {
    shape.area ("parallelogram", 7, 2)
  }

  test("area when shape if rhombus") {
    shape.area ("rhombus", 8, 2)
  }
  
  test("area when shape if square") {
    shape.area ("square", 9, 2)
  }

}
