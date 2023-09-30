package Lambdas_as_Function_Parameters_92

fun main() {
    lineLogger {
        println("Message 0")
        println("Message 1")
        println("Message 2")
        println("Message 3")
    }
}

fun lineLogger(block: () -> Unit) {
    repeat(5) { println("------------------") }

    block()

    repeat(5) { println("___________________") }
}