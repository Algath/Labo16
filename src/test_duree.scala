object test_duree extends App {
  /*
  * Créer 1 tableau de 10k, 50k, 100k et mesure le temps nécessaire pour les trier.
  * Test à faire 10x par tableau
  * */
  def testSelectionSort(): Unit = {
    println("Time for random : ")
    println("Time for 10000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = RandomArrayFactory.create(10000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for 50000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = RandomArrayFactory.create(50000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for 100000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = RandomArrayFactory.create(100000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for inverted : ")
    println("Time for 10000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = InvertedSortedArrayFactory.create(10000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for 50000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = InvertedSortedArrayFactory.create(50000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for 100000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = InvertedSortedArrayFactory.create(100000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for melangé : ")
    println("Time for 10000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = ShuffleArrayFactory.create(10000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for 50000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = ShuffleArrayFactory.create(50000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
    println("\nTime for 100000K : ")
    for (i:Int <- 0 until 10){
      var a:Array[Int] = ShuffleArrayFactory.create(100000)
      var t1 = System.nanoTime()

      a = SelectionSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1)/1000000)
    }
  }
  testSelectionSort()
  def testYSort(): Unit = {
    println("Time for random : ")
    println("Time for 10000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = RandomArrayFactory.create(10000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for 50000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = RandomArrayFactory.create(50000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for 100000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = RandomArrayFactory.create(100000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for inverted : ")
    println("Time for 10000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = InvertedSortedArrayFactory.create(10000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for 50000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = InvertedSortedArrayFactory.create(50000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for 100000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = InvertedSortedArrayFactory.create(100000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for melangé : ")
    println("Time for 10000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = ShuffleArrayFactory.create(10000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for 50000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = ShuffleArrayFactory.create(50000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
    println("\nTime for 100000K : ")
    for (i: Int <- 0 until 10) {
      var a: Array[Int] = ShuffleArrayFactory.create(100000)
      var t1 = System.nanoTime()

      a = YSort.sort(a)
      var t2 = System.nanoTime()

      println((t2 - t1) / 1000000)
    }
  }
}