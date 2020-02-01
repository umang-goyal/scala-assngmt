package edu.knoldus

import org.scalatest.FunSuite


class FibbonaciTest extends FunSuite {

  val fibbonaci = new Fibbonaci

  test("fibbonaci series for limit 7"){
    fibbonaci.fib(7)
  }

  test("fibbonaci series for limit 17"){
    fibbonaci.fib(17)
  }

  test("fibbonaci series for limit 0"){
    fibbonaci.fib(0)
  }

}
