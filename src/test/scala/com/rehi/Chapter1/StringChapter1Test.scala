package com.rehi.Chapter1
//http://www.scalatest.org/user_guide/using_matchers

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.Matchers._
import org.scalactic.Explicitly._
import org.scalactic.StringNormalizations._


class StringChapter1Test extends FunSuite with BeforeAndAfter {

  var stringChapter1: StringChapter1 = _

  before {
    stringChapter1 = new StringChapter1
  }

  test("TestForVar") {
    assert(stringChapter1.s == "Hello, World")
    assert(stringChapter1.s1 == "Hello")
    assert(stringChapter1.s2 == "hello")
    assert(stringChapter1.result == "Dpsh, Rhi")
    stringChapter1.result should have length(9)
    

  }

  test("TestForEquality") {
    println(stringChapter1.multiLine)
    println(stringChapter1.multiLine.stripMargin)
    assert(stringChapter1.s1.equalsIgnoreCase(stringChapter1.s2), """ ********"Case Is Checked"*******""")
    "Hi" should equal ("hi") 
  }

  test("TestForMultiLine") {
    assert(stringChapter1.multiLine == stringChapter1.multiLine.stripMargin)
    assert(stringChapter1.multiLine.replaceAll("\n", "") == "This is multiLine String")
    
  }
  
  test("TestForArrayEquality"){
    val  testArray = Array[String]("Hello,","World")
    stringChapter1.s.split(" ") should equal(testArray)
    stringChapter1.s.split(" ").apply(0) should equal(testArray.apply(0))
    assert(stringChapter1.s.split(" ").apply(0) == testArray.apply(0))
    assert(stringChapter1.s.split(" ") == testArray, 
                                          """********"By default, an implicit Equality[T] instance, 
                                             |in which equality is implemented by simply invoking == on the left value, passing in the right value,
                                             |with special treatment for arrays. 
                                             |If either left or right is an array, 
                                             |deep will be invoked on it before comparing with ==. 
                                             |Thus, the following expression will yield false, because Array's equals method compares object identity"*********""".stripMargin)

  }
}