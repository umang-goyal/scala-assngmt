package edu.knoldus

class AreaOfShapes {

  val function = (firstDimension: Int, secondDimension: Int)=> firstDimension*secondDimension

  def area(shape: String, firstDimension: Int, secondDimension: Int, f:(Int,Int) => Int):String={
    shape match {
      case "rectangle" => s"area of $shape is ${f(firstDimension, secondDimension)}"
      case "parallelogram" => s"area of $shape is ${f(firstDimension, secondDimension)}"
      case "rhombus" => s"area of $shape is ${f(firstDimension, secondDimension)}"
      case _ => s"not defined yet for $shape"
    }
  }
}

