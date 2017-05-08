

object StringChapter1 {
    def main(args: Array[String]): Unit = {

    val a = "Hello, World"
  
    println(a.getClass.getName)
    println(a.length())
    
    
    "hello".foreach(println)
    
    //You can treat a String as a sequence of characters in a for loop:
    for(c <- "\nhello") println(c)
    
  }
}