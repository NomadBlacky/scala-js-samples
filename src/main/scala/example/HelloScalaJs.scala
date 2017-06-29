package example

object HelloScalaJs {
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach { i =>
      (i % 3, i % 5) match {
        case (0, 0) => println("FizzBuzz")
        case (0, _) => println("Fizz")
        case (_, 0) => println("Buzz")
        case (_, _) => println(i)
      }
    }
  }
}
