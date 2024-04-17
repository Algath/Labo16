object chercheSize extends App {

  var SELECTIONSORT:Int = 0
  var YSORT:Int = 1

  def SearchSize(_type:Int): Int = {

    if(_type == SELECTIONSORT){

      var time:Int = 15
      var size:Int = 10000
      while (time < 9 || time > 11) {

        var a: Array[Int] = RandomArrayFactory.create(size)

        var t1 = System.nanoTime()
        a = SelectionSort.sort(a)
        var t2 = System.nanoTime()

        time = ((t2 - t1) / 1000000).toInt
        //println(time)

        if(time > 11)
          size -= size / 2
        else if (time < 9)
          size += size / 2

      }

      return size

    }
    else if (_type == YSORT) {

      var time: Int = 0
      var size: Int = 10000
      while (time < 9 && time > 11) {

        var a: Array[Int] = RandomArrayFactory.create(size)

        var t1 = System.nanoTime()
        a = YSort.sort(a)
        var t2 = System.nanoTime()

        time = ((t2 - t1) / 1000000).toInt

        if (time > 11)
          size -= size / 2
        else if (time < 9)
          size += size / 2

      }

      return size

    }else
      return -1

  }


  println(SearchSize(SELECTIONSORT))

}
