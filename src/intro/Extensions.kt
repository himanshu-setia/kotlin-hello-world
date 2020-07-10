package intro

import java.lang.StringBuilder

// It is a regular statid function in java
fun String.lastChar() = this.get(this.length - 1)

// Alternate way to write
fun String.lastCharAlt() = get(length - 1)

// Note: Extension cannot call private members of String
fun String.repeat(n: Int):String {
    val sb = StringBuilder(n * length)
    for(i in 1..n)
        sb.append(this)
    return sb.toString()
}

val sentence = """my name
    |is himanshu""".trimMargin()

val dateRegex = "\\d{2}.\\d{2}.\\d{4}".toRegex()
val dateRegex2 = """\d{2}.\d{2}.\d{4}""".toRegex()

infix fun <T> T.eq(other: T) {
    if(this == other)
        println("OK")
    else
        println("Not same")
}

fun main() {
    val c: Char = "abc".lastChar()
    //println(c)
    println(sentence)
    println(dateRegex.matches("15.02.2019"))
    5 eq 5

}
