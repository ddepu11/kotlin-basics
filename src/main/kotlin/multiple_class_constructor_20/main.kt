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

    println("\nVehicle\n")

    var vehicle1 = Vehicle(name = "Splendor", isItElectric = false, isItHybrid = false, isItPetrol = true, mileage = 60, type = "2 vehler")

    var vehicle2 = Vehicle(name = "XUV 700", type = "4 Vehilre", mileage = 15)

    var vehicle3 = Vehicle(name = "Tata Neon", mileage = 29)

}