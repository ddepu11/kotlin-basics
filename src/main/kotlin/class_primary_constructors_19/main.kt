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

    println()

    val car1 = Car("Nexus", price = 23_00_000.0, economy = 21, fuelCapacity = 10, passengerCapacity = 8)

    car1.printCarDetails()
    val carNameAndEconomy = car1.nameAndEconomy()

    println(carNameAndEconomy)
}