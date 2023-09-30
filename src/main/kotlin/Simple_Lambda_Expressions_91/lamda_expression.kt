package Simple_Lambda_Expressions_91

import java.util.*

fun main() {

//   Lambda expression format
//   val lambdaName:(InputType) -> ReturnType = { arguments : InputType -> body }

    val greeter: (String, Int) -> String = { name: String, age: Int ->

        val modifiedName: String = name.split(" ").joinToString { it.uppercase(Locale.getDefault()) }
        "Hello $modifiedName  | $age"
    }

//  See this is shorter
    val greet = { name: String, message: String -> "Hello $name, $message" }

    val greeting = greeter("Mohan Raj", 30)

    println(greeting)

    println(greet("Anubhav","There is a message!"))
}