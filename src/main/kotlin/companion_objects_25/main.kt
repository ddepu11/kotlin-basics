package companion_objects_25

fun main() {

    var user = User.createUser("Akki", "Kumar")

//    println(user.getFullName())

    val users = User.createUsers(3)

//    users.forEach { println(it.getFullName()) }

    val users2 = User.users

//  users.forEach { println(it.getFullName()) }

    println("PI ${MathUtil.PI}")
    var biggerNumber = MathUtil.findTheBiggerNumber(23,4)

    var smallestNumber = MathUtil.findSmallestNumber(5,4)

    println("$biggerNumber")
    println("$smallestNumber")
}