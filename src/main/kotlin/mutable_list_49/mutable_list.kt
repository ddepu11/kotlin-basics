package mutable_list_49
fun main() {
   val mutableList = mutableListOf(1,2,4,5,5,6,8,9)

//    println(mutableList)

    mutableList.remove(5)
    mutableList.add(234)

//    println(mutableList)

    val mohan = User("Mohan","Kumar")
    val sohan = User("Sohan","Kumar")

    val users = mutableListOf<User>(mohan,sohan)

    users.forEach{
        println(it)
    }

    users.remove(sohan)

    println("Removed an Item \n")

    users.forEach{
        println(it)
    }

    users[0] = User("Uday","Singh")
    println("Added an Item \n")

    users.forEach{
        println(it)
    }

}