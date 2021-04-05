fun main()
{
    var list: List<Int> = listOf(1,3,4,5,6,8)
    println(list)

    var list1 :MutableList<Int> = mutableListOf(2,3,4,5,6,7)
    println(list1)

    list1.add(1)
    list1.remove(3)
    list1.removeAt(2)
    println(list1)

    println(list1.contains(6))

    val e : List<Int> = list1.filter { it%2 == 0 }
    println(e)

    val f : List<Int> = list1.filterNot { it%2 == 0 }
    println(f)

    val li : MutableList<Int> = mutableListOf(1,5,4,2,7)

    val new : List<Int> = li.map { it*it }
    println(new)

    val slice : List<Int> = li.slice(0..2)
    println(slice)

    //omits last index value
    val sub : List<Int> = li.subList(0,2)
    println(sub)

    val t : List<Int> = li.take(4)
    println(t)

    val q : List<Int> = li.takeLast(3)
    println(q)

    val s : List<Int> = li.sorted()
    println(s)
}