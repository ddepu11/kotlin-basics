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

//    New Examples
    val sum = 3+4
    println(square(5))

    checkAge(22)


// Lambda Expressions:
    val numbers = listOf(1,3,5,6,7,8,33)

    val doubled = numbers.map { it *2 } // Doubles each number using a lambda expression

    println("Doubled $doubled")
}


//fun sayHello1() {
//    println("Hello 1")
//}
// Instead we can make it like: single line expression function

//Function with a Single Expression:
fun sayHello1() = println("Hello 1")


// Defines a function to calculate the square of a number
fun square(x:Int)  = x * x

//Conditional Expression
fun checkAge(age:Int) = if(age>18) println("Allowed to drive")else println("Not allowed to drive!")
