package constructor_init_block_21

//In Kotlin, the primary constructor of a class can include an initialization block,
// which is executed when an instance of the class is created.
// This initialization block is defined using the init keyword.
// The init block allows you to execute code that should run as part of the instance initialization,
// similar to how you might use a constructor or initializer block in other programming languages.


// Keep in mind that you can have multiple init blocks in a class,
// and they will be executed in the order they appear in the code,
// after the primary constructor parameters are initialized.
class Computer(var name:String, var company:String, var processor:String) {

    constructor(name:String,processor: String):this(name,company="", processor){
        println("Second Constructor")
    }

    init {
        // Initialization code here
        // This code will run when an instance of Computer is created

        println("I am Init block")
    }

    init {
        println("I am 2nd init block!")
    }

}