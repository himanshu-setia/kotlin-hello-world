package intro

fun main() {
    val list = listOf(1,2,3,4,5)

    // return from lambda
    list.flatMap l@{
        if(it == 0) return@l listOf<Int>()
        listOf(it, it)
    }
}


