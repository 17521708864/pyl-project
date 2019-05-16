package scala

import scala.collection.mutable

object HelloWord extends App {
  val map = scala.collection.mutable.Map("hive" -> 1, "hadoop" -> 2)
  print(map("hive"))
}
