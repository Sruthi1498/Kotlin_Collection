fun main()
{
    val a : Set<Int> = setOf(2,7,1,4,2)
    println(a)

    val b : MutableSet<Int> = mutableSetOf(9,7,4,0,6)
    println(b)

    b.add(5)
    b.remove(7)
    println(b)

    println(a union b)
    println(a intersect b)

    println(a.count())
}