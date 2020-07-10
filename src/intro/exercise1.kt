package intro

fun isValidIdentifier(s: String): Boolean {

    fun isValidChar(ch: Char) = ch.isLetterOrDigit() || ch =='_'

    if(s.isEmpty() || !(s[0].isLetter() || s[0]=='_'))
        return false

    for(ch in s)
        if(!isValidChar(ch)) return false

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}