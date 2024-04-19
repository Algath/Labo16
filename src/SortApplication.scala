object SortApplication extends App {
  class SortApplication {
    def displayArray(n: Array[Int]): Unit = {
      for (i <- n.indices) {
        println(s"a[$i] = ${n(i)}")
      }
    }
  }

  var test: SortApplication = new SortApplication
  //  test.displayArray(RandomArrayFactory.create(10))
  //  test.displayArray(InvertedSortedArrayFactory.create(10))
  //  test.displayArray(ShuffleArrayFactory.create(7))
  //  test.displayArray(AlmostSortedArrayFactory.create(10))
}