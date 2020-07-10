package intro

// output: abc
fun loop1() {
    val list = listOf("a", "b", "c")

    // (s:String in list) is also allowed
    for (s in list)
        print(s)

    // list with index
    for ((index, element) in list.withIndex())
        println("$index : $element")

    // iterate over range
    // (i in 1 until 9) also allowed
    for (i in 1..9)
        println(i)

    for (i in 9 downTo 1 step 2)
        print(i)

    for (ch in "abc")
        print(ch+1)
}

fun loop2() {
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
        )

    for((key, value) in map) {
        println("$key = $value")
    }
}

