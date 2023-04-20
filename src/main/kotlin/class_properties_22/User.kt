package class_properties_22

class User(var firstName: String, var lastName: String) {

    var fullName = "$firstName $lastName"
    var age: Int = 0

    //    Read only property
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