package class_primary_constructors_19

// In Kotlin, a primary constructor is a special constructor that is defined within the class header.
// It's a concise way to declare and initialize the properties of a class.
// The primary constructor is part of the class header and is defined directly after the class name.

class User(var firstName: String = "", var lastName: String = "smith") {

    fun printFullName() {
        println("First Name: $firstName | Last Name: $lastName.")
    }

    fun printWithPrefix(prefix: String) {
        println("Prefix: $prefix $lastName.")
    }

    fun updateFirstName(newName: String) {
        firstName = newName
    }


    fun firstNameLength() {
        println(firstName.length)
    }
}