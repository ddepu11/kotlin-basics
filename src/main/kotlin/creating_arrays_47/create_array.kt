package creating_arrays_47

fun main(){
// Create an array
// val items = arrayOf(1,2,3,4,5,6)
// val items = doubleArrayOf(1.3, 2.45, 3.3, 4.45, 5.53, 6.09)
    val items = arrayOf("Mohan","Kumar","Singh")

    items.forEach { println(it) }


    println("$$$$$$$$#@#@#@#@#@#@#@#@#@#\n")

    val users = arrayOf(
        User("Gulshan","Kumar"),
        User("Anoop","Singh"),
        User("Abhinav","Roop")
    )

    users.forEach {
        println("${it.firstName} ${it.lastName}")
    }

    println("\n ")
    val updatedUser = users.plus(User("Pushparaj","Patel"))

    updatedUser.forEach { println("${it.firstName} ${it.lastName}") }
    println(updatedUser.size)
}