package class_properties_22


// In Kotlin, class properties are member variables or fields associated with a class.
// These properties can hold data and have associated accessors (getters) and mutators (setters) that
// control how the data is read from and written to these properties.
// Kotlin provides several ways to define and manage class properties.


class User(var firstName: String, var lastName: String) {

    var fullName = "$firstName $lastName"
    var age: Int = 0

//  Read only property
//  You can also define read-only properties using the val keyword:

    val fullNameLength: Int = fullName.length
    val firstNameLength: Int = firstName.length

    init {
        println("Init block")
        println("This is the class for $fullName")
    }

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