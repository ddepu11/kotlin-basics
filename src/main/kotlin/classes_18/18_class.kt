package classes_18

import User

fun main() {

    var user = User()
    user.firstName = "Don"
    user.lastName = "Faulker"
    user.printFullName()
    user.updateFirstName("Uraban ")
    user.printFullName()

    user.printWithPrefix("Mr. ")

    var friend = User()
    friend.firstName = "Jane"
    friend.lastName = "William"

    friend.printFullName()
    friend.printWithPrefix("Ms.")
    friend.firstNameLength()
}

