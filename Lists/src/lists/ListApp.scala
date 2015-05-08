package lists

/**
 * Created by rkomarov on 08.05.2015.
 */
object ListApp extends App {
  def listiter[A](lst :List[A]): Unit = lst match {
    case null => throw new NullPointerException
    case Nil =>
    case head :: tail => println(head); listiter(tail)
  }
  val list1 = List(1, 2, 3, 4, 5, 6)
  println(list1)
  val list2 = list1.reverse
  println(list2)
  val list3 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  println(list3)

  listiter(list1)

}
