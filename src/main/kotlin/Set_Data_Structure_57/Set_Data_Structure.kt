package Set_Data_Structure_57

fun main() {
//    Set for unique data
    val names:Set<String> = setOf("John","Rohan","Kapil","Rohan")

//    println(names)

    val mutableNames:MutableSet<String> = mutableSetOf("Red","Blue","Green","Orange")

    mutableNames.add("John")

//    println(mutableNames)

    mutableNames.add("Red")

//   println(mutableNames)


//   New Example


    val people = setOf(Person("Jakir"), Person("Jakir"),Person("Rohit"))
//  We will se a duplicate Person object in the list,
//  so to handle this use the data class or make sure your class handles equality checks correctly

    println(people)

}

// class Person(var name:String)
data class Person(var name:String)