import scala.util.Random

trait ArrayFactory {
  def create(size: Int): Array[Int]
}

object RandomArrayFactory extends ArrayFactory {
  override def create(size: Int): Array[Int] = {
    var t: Array[Int] = Array.ofDim(size)
    for (i: Int <- 0 until size) {
      t(i) = Random.nextInt(size + 1)
    }
    return t
  }
}

object InvertedSortedArrayFactory extends ArrayFactory {
  override def create(size: Int): Array[Int] = {
    var t: Array[Int] = Array.ofDim(size)

    for (i: Int <- 0 until size) {
      t(i) = size - i - 1
    }
    return t
  }
}

object ShuffleArrayFactory extends ArrayFactory {
  override def create(size: Int): Array[Int] = {
    var t: Array[Int] = Array.ofDim(size)
    var p: Int = 0

    for (i: Int <- 0 until size) {
      if (i % 2 == 0) {
        t(i) = p
        p += 1
      }
      else {
        t(i) = size - p
      }
    }
    return t
  }
}

object AlmostSortedArrayFactory extends ArrayFactory {
  var percent: Int = 20

  override def create(size: Int): Array[Int] = {
    var t: Array[Int] = Array.ofDim(size)

    for (i: Int <- 0 until size) {
      t(i) = i
    }
    for (i: Int <- 0 until (percent * size / 100) / 2) {
      var r: Int = Random.nextInt(size / 2)
      var x: Int = t(r)

      t(r) = t(size - 1 - r)
      t(size - 1 - r) = x
    }
    return t
  }
}
