fun main() {
    var x = sayHi()
//    println(x)

    var y = nomom()

    println(y)

    val age = whatsYourAge()

    println("My Age is $age")

}

// By default, function return Unit
fun sayHi() {
    println("Hello world")
}

fun nomom(): String {

    return "Returning a string type value"

}


fun whatsYourAge():Int {
    return 27
}