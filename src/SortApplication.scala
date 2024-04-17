object SortApplication extends App {
  class SortApplication {
    def displayArray(n: Array[Int]): Unit = {
      for (i <- n.indices) {
        println(s"a[$i] = ${n(i)}")
      }
    }


  }

  var test: SortApplication = new SortApplication
//    test.displayArray(RandomArrayFactory.create(10))
    test.displayArray(InvertedSortedArrayFactory.create(177))
//  println
//    test.displayArray(ShuffleArrayFactory.create(7))
//    test.displayArray(AlmostSortedArrayFactory.create(10))
//    test.displayArray(SelectionSort.sort(InvertedSortedArrayFactory.create(10)))

//  var i = (177 to 0 by -1).toArray
//  println(i.mkString(","))


}