def filterEvenNumbers(list: List[Int]): List[Int] = {
  list.filter(item => item % 2 == 0)
}

object Q1 extends App {

  val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val outputList = filterEvenNumbers(inputList)
  println(outputList)
}
