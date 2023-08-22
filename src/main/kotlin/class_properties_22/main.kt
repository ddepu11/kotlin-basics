package class_properties_22

fun main() {
    val user = User("Umesh", "Singh")

    println(user.fullName)

    user.fullName = "Some one else"

    println(user.fullName)
    user.age = 23

    println(user.age)

    println("Full name length: ${user.fullNameLength}")
    println("First name length: ${user.firstNameLength}")

//  Can't do this coz it's a read only property.
//  user.fullNameLength = 23


    println("Mobile \n")

    val mobile1 = Mobile(name = "Moto G52", price = 16000.00,6)

    println("Configuration: ${mobile1.configuration}")


    mobile1.makeACall("9094859375")
    mobile1.sendSMS("8748392784", message = "A new message from user1")

    mobile1.takeAPic()

    mobile1.updateName("Oneplus 2A")

    println("Updated: ${mobile1.name}")

// We can read the private props but cant update them
    println("${mobile1.configurationLength}")

//    mobile1.configurationLength = 56
}