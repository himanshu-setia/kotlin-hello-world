package intro

import intro.Gender.*;

/*
 What is data class?

 We frequently create classes whose main purpose is to hold data.
 In such a class some standard functionality and utility functions
 are often mechanically derivable from the data. In Kotlin, this
 is called a data class and is marked as data:
 Reference - https://kotlinlang.org/docs/reference/data-classes.html
*/
data class Hero (
    val name: String,
    val age: Int,
    val gender: Gender?
)

enum class Gender {MALE, FEMALE}

fun main(args: Array<String>) {
    val heroes = listOf(
        Hero("The Captain", 60, MALE),
        Hero("Frenchy", 42, MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, FEMALE),
        Hero("First Mate", 29, MALE),
        Hero("Sir Stephen", 37, MALE))

    println(heroes.map { it.age }.distinct().size)
    println(heroes.filter { it.age < 30 }.size)

    // Partition splits the list into two partitions
    val (youngest, oldest) = heroes.partition { it.age < 30 }
    oldest.size

    println(heroes.maxBy { it.age }?.name)
    println(heroes.all { it.age < 50 })
    println(heroes.any { it.gender == FEMALE })

    val mapByAge: Map<Int, List<Hero>> =
        heroes.groupBy { it.age }
    println(mapByAge)
    val (age, group) = mapByAge.maxBy { (_, group) ->
        group.size
    }!!
    println(age)


    val mapByName: Map<String, Hero> =
        heroes.associateBy { it.name }
    println(mapByName)

    // Below two are same
    println(mapByName["Frenchy"]?.age)
    mapByName.getValue("Frenchy").age

    val mapByName2 = heroes.associate { it.name to it.age }
    println(mapByName2)

    // { 0 } is the default value, used only If needed
    println(mapByName2.getOrElse("Frenchy") { 0 })
    println(mapByName2.getOrElse("unknown") { 0 })

    val allPairs = heroes.flatMap { first ->
        heroes.map { second ->
            first to second
    } }
    println(allPairs)
    val answer = allPairs.maxBy { it.first.age - it.second.age }!!
    println("The age difference between ${answer.first.name} and ${answer.second.name} " +
            "is ${answer.first.age - answer.second.age} ")
}

