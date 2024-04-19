trait Sort {
  def sort(n: Array[Int]): Array[Int]
}

object SelectionSort extends Sort {
  override def sort(n: Array[Int]): Array[Int] = {
    val tableau: Array[Int] = n

    for (i <- tableau.indices) {
      var min: Int = tableau(i)
      for (j <- i + 1 until tableau.length) {
        val oldMin = min
        if (tableau(j) < min) {
          min = tableau(j)
          tableau(j) = oldMin
        }
      }
      tableau(i) = min
    }
    tableau
  }
}