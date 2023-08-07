def calculateSquare(list: List[Int]): List[Int] = {
  list.map(item => item * item)
}

object Q2 extends App {

  val inputList = List(1, 2, 3, 4, 5)
  val outputList = calculateSquare(inputList)
  println(outputList)
}
