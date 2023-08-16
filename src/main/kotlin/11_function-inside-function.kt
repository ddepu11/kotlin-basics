fun main() {
    sayHiAndBye()

//    sayBye() // Cant call it here

    println("\n")

    yetAnotherFunc()

}


fun sayHiAndBye() {
    println("Hello")

//    mooInsideAFunc() // Cant call it here

    fun sayBye() {
        println("Bye")

        fun mooInsideAFunc (){
            println("moooo...!")

        }

        mooInsideAFunc()

    }

    sayBye()

}


fun  yetAnotherFunc (){
    println("Yet Another Function!")

    fun innerFunction(){
        println("Inside inner function")
    }

    innerFunction()
}