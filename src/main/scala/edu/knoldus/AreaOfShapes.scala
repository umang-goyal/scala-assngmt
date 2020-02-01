package edu.knoldus

class AreaOfShapes {

  def calArea(firstDimension: Int, secondDimension: Int, f:(Int,Int) => Int){ f(firstDimension,secondDimension)}

  def area(shape: String, firstDimension: Int, secondDimension: Int):String=
    shape match {
    case "rectangle" => s"area of $shape is ${calArea(firstDimension, secondDimension, (a,b)=> a*b )}"
    case "parallelogram" => s"area of $shape is ${calArea(firstDimension, secondDimension, (a,b)=> a*b) }"
    case "rhombus" => s"area of $shape is ${calArea(firstDimension, secondDimension, (a,b)=> (a*b)/2 )}"
    case _ => s"not defined yet for $shape"
  }
}
