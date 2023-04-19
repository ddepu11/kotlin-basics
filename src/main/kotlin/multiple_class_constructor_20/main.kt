package multiple_class_constructor_20

fun main() {

//    This is using primary constructor
    val user = User("Mohan", "Kumar", isPlatinum = true)
    user.printFullName()


//    This is using secondary constructor
    val friend = User("Umesh", "Paul")
    friend.printFullName()


    val secondFriend = User("Ramesh")
    secondFriend.printFullName()



}