package class_primary_constructors_19

fun main() {
    val user = User(firstName = "Mohan", lastName = "Kumar")
    user.firstName = "Jason"
    user.lastName = "Smith"

    user.printFullName()


    val myFriend = User(firstName = "Ayush")
    myFriend.firstName = "Ujjwal"
//    myFriend.lastName = "Soni"

    myFriend.printFullName()
}