package intro

val s: String? = "hey"

val len = s?.length

// Elvis operator for defaults
val len2: Int = s?.length?: 0

fun String?.isEmptyOrNull(): Boolean {
    if (this == null || this.isEmpty())
        return true

    return false
}

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}