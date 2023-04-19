class User {
    var firstName: String = ""
    var lastName: String = ""


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