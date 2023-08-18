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


    println('\n')
//    City
    var city1 = City()
    city1.name = "Jabalpur"
    city1.famousFor = "Maa Narmada"

    city1.logNameAndFamousFor()

    city1.justLogTheCity()
    city1.changeCityName("Banglore")
    city1.justLogTheCity()


    println()
    var city2 = City()

    city2.name = "Udaipur"
    city2.famousFor = "Palace"

    city2.logNameAndFamousFor()

}

