class SortApplication {
  def displayArray(n: Array[Int]): Unit = {
    for (i <- n.indices) {
      println(n(i))
    }
  }
}
