package intro

fun main() {

    // Store lambda as a variable. It might be convenient if you
    // want to postpone calling a lambda
    val sum = { x: Int, y: Int -> x + y }
    val sum2: (Int, Int) -> Int = {x, y -> x + y}
    val isEven = { i: Int -> i % 2 == 0 }
    val isEven2: (Int) -> Boolean = { i -> i % 2 == 0}
    val identity = {x: Int -> x}

    // How to call lambda later
    sum(2, 4)
    identity(4)
    run { identity(4) }

    val list = listOf(1, 2, 3, 4)
    val result = list.any(isEven)
    println(result)
    println(list.filter(isEven))

    // Nullable function type
    val f: (() -> Int)? = null

    // cannot call
    // f()

    // Do a null check before calling
    if (f != null) {
        f()
    }
    // OR
    f?.invoke()

    // Note: you can store lambda in a variable but not functions
    fun isEven3(i: Int): Boolean = i % 2 == 0
    // val predicate = isEven3  Not allowed, Compile error
    val predicate = ::isEven3   // function reference allowed instead
    val predicate2 = { i: Int -> isEven3(i)}

    // References allow to hide all parameters
    fun sendEmail(person: String, message: String) = "Sending $message to $person"
    val action = {person: String, message: String ->
        sendEmail(person, message)
    }
    val action2 = ::sendEmail   // params hidden

    // When lambda code starts getting complicated, you can use reference
    // instead of huge lambda. E.g.
    list.any(::isEven3)

    // Bound vs Unbound references
    class Person(val name: String, val age: Int) {
        fun isOlder(ageLimit: Int) = age > ageLimit
    }

    // Unbound reference
    val agePredicate = Person::isOlder
    val agePredicate2: (Person, Int) -> Boolean = Person::isOlder
    val agePredicate3: (Person, Int) -> Boolean =
        { person, ageLimit -> person.isOlder(ageLimit) }

    // Bound reference
    val alice = Person("Alice", 29)
    val agePredicateBound = alice::isOlder
    agePredicateBound(21) // Note there is no person param, as it is already set
    val agePredicateBound2: (Int) -> Boolean =
        { ageLimit -> alice.isOlder(ageLimit) }
}
