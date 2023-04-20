package constructor_init_block_21

class User(var firstName: String = "", var lastName: String = "smith") {


    constructor(firstName: String) : this(lastName = "Kumar") {
        println("Second constructor called.")
    }


    //    Initializer block
//    You can perform initialization for your class
//    This is called after the primary constructor has been invoked
    init {
        println("Hello 1")
    }

    //    We can have multiple initializer block
//    These will be invoked in the order in which they are defined.
    init {
        println("Hello 2")
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