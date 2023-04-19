fun main() {
    sayHello1()

    val age = 12

    fun doWork() {
        if (age < 21) {
            println("Less then 21")
        } else {
            println("Eligible")

        }
    }
    doWork()
}


//fun sayHello1() {
//    println("Hello 1")
//}
// Instead we can make it like: single line expression function

fun sayHello1() = println("Hello 1")