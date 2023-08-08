def gcd(a: Int, b: Int): Int = b match {
  case 0          => a;
  case x if x > a => gcd(b, a);
  case _          => gcd(b, a % b);
}

def isPrime(p: Int, n: Int): Boolean = n match {
  case x if (x == p)      => true;
  case x if gcd(p, x) > 1 => false;
  case x                  => isPrime(p, x + 1)
}

def filterPrime(list: List[Int]): List[Int] = {

  val filterPrime: List[Int] => List[Int] = list => list.filter(isPrime(_, 1))

  filterPrime(list)
}

object Q3 extends App {
  val inputList = List(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
  val primeList = filterPrime(inputList)
  println(primeList)
}
