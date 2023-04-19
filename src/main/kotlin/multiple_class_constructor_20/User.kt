package multiple_class_constructor_20

class User(var firstName: String = "", var lastName: String = "smith", var isPlatinum: Boolean) {


    constructor(firstName: String, lastName: String) : this(firstName, lastName, false) {
        println("This is secondary constructor.")
    }

    constructor(firstName: String) : this(firstName, lastName = "Unknown", isPlatinum = true){
        println("I am third constructor.")
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