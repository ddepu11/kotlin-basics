package getters_setters_23

// In Kotlin, getters and setters are methods that allow you to control how class properties are accessed and modified.
// Getters are responsible for returning the value of a property,
// while setters are responsible for modifying the value of a property.

fun main() {
    val user = User("Shubham", "Singh")

//    println(user.fullName)

    user.fullName = "Mohan"

//    println(user.fullName)

    user.fullName = "Arjun Ramesh"

//    println(user.fullName)

    val lap1 = Laptop("Lenovo XZ", price = 45000.0)

    println(lap1.details)

    lap1.details = "Hey There is a new details for the laptop above please update it."

    println(lap1.details)

}