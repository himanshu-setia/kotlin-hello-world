package intro

import java.lang.IllegalArgumentException

enum class Color {
    BLUE,
    RED,
    GREEN,
    ORANGE,
    YELLOW,
    PINK
}

fun getDescription(color: Color): String =
     when(color) {
         Color.BLUE -> "blue"
         Color.RED -> "red"
         Color.GREEN -> "green"
         else -> ""
    }

fun respondToInput(input: String) =
        when(input) {
            "y", "yes" -> "You're in"
            "n", "no" -> "Sorry access denied"
            else -> "Please enter correct input"
        }

fun mixColor(c1: Color, c2: Color) =
        when(setOf(c1, c2)) {
            setOf(Color.BLUE, Color.GREEN) -> Color.ORANGE
            setOf(Color.BLUE, Color.RED) -> Color.YELLOW
            else -> throw IllegalArgumentException("Dirty color")
        }

fun isLetter(ch: Char) = ch in 'a'..'z' || ch in 'A'..'Z'

fun isNotDigit(ch: Char) = ch !in '0'..'9'
/*
// Example of smart cast
when(val pet = getMyFavouritePet()) {
    // Check type
    is Cat -> pet.meow()
    is Dog -> pet.woof()
    else -> throw Exception("Invalid pet")
}
 */