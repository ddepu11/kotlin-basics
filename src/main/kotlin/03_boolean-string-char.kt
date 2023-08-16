import java.util.*

fun main() {
//    String are also known as object
//    For string we use "" (double quotes)
    var fullName: String = "Mohan Kumar"
//    println(fullName.length)
//    println(fullName.replaceFirstChar { it.uppercase(Locale.getDefault()) })
//    println(fullName.lowercase(Locale.getDefault()))

    val sentence = "Welcome To Kotlin!"
    val word = sentence.split(" ")

//    println(word.joinToString("_"){ word-> word.replaceFirstChar { it.lowercase() }})



//  For char, we use '' (single quotes)
//  Char represents 16 bit unicode character
    val c: Char = '@'
//    println("Char: $c")

    val otherCharacters: Char = '\t' // \t, \\, \n and other
//    println("Other Char: __$otherCharacters __  ")

//  You can also use string to store single character,
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

//    println(message)

    var newMultilineMessage  = """
        Hey Mohan,
        I hope you are doing well, i was writing to you about your next project
        that ypu are going to work on.
        
        Thanks,
        Sonam
    """.replaceIndent("__")

//    println("New Multiline: $newMultilineMessage")

    var name = "Dhiraj Singh"
    var age = 23

//  String interpolation
//  println("Hello $name, you are $age years old. and your name is ${name.length} character long.")


//  Char uses single quote and can have one character
    val myCharValue = 'S'

//    println("My Char $myCharValue")

//    val myBooleanValue = true
    val myBooleanValue = false
//    println("My Boolean: $myBooleanValue")

    var isBlank:Boolean = false

//    println("Is Blank: $isBlank")
//    println("Is Blank: ${isBlank.not()}")


    isBlank = "3".isBlank()
    println("Is Blank: $isBlank")


}