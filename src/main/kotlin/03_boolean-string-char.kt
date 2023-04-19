import java.util.*

fun main() {
//    String are also known as object
//    For string we use "" (double quotes)
    var fullName: String = "Mohan Kumar"
    println(fullName.length)
    println(fullName.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    println(fullName.lowercase(Locale.getDefault()))


//  For char we use '' (single quotes)
//  Char represents 16 bit unicode character
    val c: Char = 'X'
    val otherCharacters: Char = '\n' // \t, \\ and other
//    println(otherCharacters)

//  You can also use string to store single character
//  but it will take large memory, so it better
//  to use char if you are going to store single character
    var foo: String = "Y"


//  When you want string in multiple line
    var message: String = "Hello, \nMy name is mohan kumar and i am an archeologist."

//    but there is a better way

    message = """
       >>>Hello, 
       >>>My name is jonny walker and i teach science. 
       >>>How are you all?
    """.trimMargin(">>>")

//    trimIndent(), replaceIndent("##__##:_"), trimMargin(">>>")

    println(message)


    var name = "Dhiraj Singh"
    var age = 23

//  String interpolation
    println("Hello $name, you are $age years old. and you name is ${name.length} character long.")


//    Char uses single quote and can have one character
    val myCharValue = 'S'

    println("My Char $myCharValue")

//    val myBooleanValue = true
    val myBooleanValue = false
    println("My Boolean: $myBooleanValue")


}