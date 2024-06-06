package com.example

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable

class ScalaTest extends AnyFlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }
}