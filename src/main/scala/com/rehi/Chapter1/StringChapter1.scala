package com.rehi.Chapter1

import java.util.Map

case class Prefixer(val prefix: String)

class StringChapter1 {

  
  
  def addPrefix(s: String)(implicit p: Prefixer) = p.prefix + s
  implicit val myImplicitPrefixer = new Prefixer("***")
  
  addPrefix("abc")

  val s = "Hello, World"
  val s1 = "Hello"
  val s2 = "h" + "ello"

  val s3 = Option
  val s4 = Option

  val result = "Deepesh, Rehi".filter(_ != 'e')
  val multiLine = """This is 
                  #multiLine String""".stripMargin('#')
  
}
