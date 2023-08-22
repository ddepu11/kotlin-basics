package constructor_init_block_21


// In Kotlin, the primary constructor of a class can include an initialization block,
// which is executed when an instance of the class is created.
// This initialization block is defined using the init keyword.
// The init block allows you to execute code that should run as part of the instance initialization,
// similar to how you might use a constructor or initializer block in other programming languages.

// Keep in mind that you can have multiple init blocks in a class,
// and they will be executed in the order they appear in the code,
// after the primary constructor parameters are initialized.

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