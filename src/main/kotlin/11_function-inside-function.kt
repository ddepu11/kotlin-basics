fun main() {
    sayHiAndBye()
//    sayBye() // Cant call it here
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