@file:JvmName("Util3")
package intro

import java.io.IOException
import java.lang.NumberFormatException

fun foo() { throw IOException() }

@Throws(IOException::class)
fun bar() { throw IOException() }

fun main() {

    // try is an expression in Kotlin
    val number = try {
        Integer.parseInt("10e")
    } catch (e: NumberFormatException) {
        null
    }
    print(number)
}
