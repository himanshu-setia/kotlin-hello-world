@file:JvmName("Util2")
package intro

@JvmOverloads
fun generateEmail(firstName: String = "Himanshu", lastName: String = "Setia") : String {
    return listOf<String>(firstName, lastName).joinToString(separator = "", postfix = "@gmail.com")
}

// picks up first name
fun getDefaultEmail(): String = generateEmail("setia")

// picks up first name
fun getDefaultEmail2(): String = generateEmail(lastName = "setia")
