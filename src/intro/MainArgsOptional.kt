@file:JvmName("Util")
package intro

fun main(args: Array<String>) {
    // If is an expression in Kotlin
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, ${name()}")
}

fun name(): String {
    var name:String = "himanshu"
    return name
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Another way of writing max
fun max2(a: Int, b: Int): Int = if (a > b) a else b

fun checkJoin(a: String, b: String): String = listOf<String>(a, b).joinToString(separator = ".",
    prefix = "[", postfix = "]")