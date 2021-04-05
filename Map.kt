fun main()
{
    val m : Map<Int, String> = mapOf(1 to "Alice", 3 to "Bob", 6 to "joe", 4 to "jack", 7 to "jill")
    println(m)

    println(m.count())

   val l : MutableMap<String, Int> = mutableMapOf("a" to 3 , "b" to 2, "c" to 8)
    l.put("d",9)

    println(l)

    println(l.containsKey("a"))
    println(l.containsValue(2))

    println(l.filterKeys { it == "a" })

    println(l.filterValues { it == 2 })

    println(m.toSortedMap())

    println(m.getOrDefault(10,"not found"))

    println(m.keys)
    println(m.values)
}