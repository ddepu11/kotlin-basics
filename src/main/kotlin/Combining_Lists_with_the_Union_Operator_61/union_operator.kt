package Combining_Lists_with_the_Union_Operator_61

fun main() {
    val people  = listOf(Person("Arun"),
                          Person("Abhishek"),
                          Person("Abhilash"),
                          Person("Bhushan"),
                          Person("Zorawar")
        )

    val morePeople = listOf(Person("Zakir"),
                            Person("Owais"),
                            Person("Bhushan"),
                            Person("Arun"),
                            Person("Zorawar")
        )

//  union will not include the duplicates
    val uniqueUnion = people.union(morePeople)

    println("Unique Union:")

    uniqueUnion.forEach { println(it) }
}

data class  Person(val name:String){
}