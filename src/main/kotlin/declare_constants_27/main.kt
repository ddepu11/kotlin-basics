package declare_constants_27


// In Kotlin, constants are values that are assigned once and cannot be changed afterward.
// They are often used to hold values that are not supposed to be modified during the execution of a program.
// Kotlin provides two primary ways to define constants:

// Using the val Keyword: You can define constants using the val keyword.
// This creates an immutable property that can't be reassigned after its initial value is set.

// Using the const Modifier: If you want to ensure that a constant is actually a compile-time constant (i.e. its value is determined at compile time),
// you can use the const modifier in combination with the val keyword. However, not all types can be declared as const in Kotlin.
// The types that can be used with the const modifier are very limited:

// Primitive Types: Only primitive types like Int, Long, Short, Byte, Char, Float, and Double can be declared as const.

// String: String literals can also be declared as const.

// Enum Members: Members of an enum class can be declared as const if the enum itself is marked as const.

// Top-Level or Member Objects: If an object is declared at the top level of a file or as a member of a class and consists of only const properties, it can be treated as a compile-time constant.


const val MAX_AGE = 18

fun main() {
//    Different ways to declare constants
    val user = User("Mohan", "Kumar")
    user.MAX_AGE

//  Can't access MAX_SCORE like this because it is inside a companion object
//  user.MAX_SCORE


//    But we can access it like
    User.MAX_SCORE



//

    Constants.MAX_AGE
    Constants.MIN_AGE

    println(MAX_AGE)
}