package ` creating_Immutable_lists_48`

fun main(){
    val items = listOf( 1,3,4,5,6,3,2)

    items.forEach {
        println(it)
    }

    println("\n")

    val users = listOf(User("Roshan","Kumar"),User("XYZ","mno"))

    users.forEach { println(it) }


    println(users.first())
    println(users.last())

    var name:String? = null

    name = "Sunil"

    val stuff = if(name==null) emptyList<String>() else listOf(name)


    println("Stuff $stuff")
}