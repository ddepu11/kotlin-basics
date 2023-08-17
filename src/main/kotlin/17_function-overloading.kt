// Function overloading in Kotlin allows you to define multiple functions with the same name
// but different parameter lists. This enables you to provide different implementations of a
// function depending on the types or number of arguments passed to it. Kotlin's function overloading is a
// form of polymorphism that enhances code readability and re-usability.

fun main() {
    printUserInfo2("Agrit")
    printUserInfo2("Mohan", 23)

    printUserInfo2("Mohan", 23, "Blue")

    println("\n")

    doSomeExercise("Squates")
    doSomeExercise("Pull ups",  false)

    println("\n")

    printValue(23)

    printValue("Tere te")

}

//fun printUserInfo2(name: String) {
//    println("Name: $name")
//}
//
//fun printUserInfo2(name: String, age: Int) {
//    println("Name: $name | Age: $age")
//
//}
//
//fun printUserInfo2(name: String, age: Int, favColor: String) {
//    println("Name: $name | Age: $age | Fav Color: $favColor")
//
//}

// Or instead we can use default argument value.
fun printUserInfo2(name: String, age: Int = 0, favColor: String = "") {
    println("Name: $name | Age: $age | Fav Color: $favColor")

}



fun doSomeExercise(name:String){
    println("Exercise Name $name")
}

fun doSomeExercise(name:String,isItHard:Boolean){
    println("Exercise Name $name | Is it hard: $isItHard")

}


//Parameter Types for Overloading:
//Kotlin allows you to differentiate overloaded functions by their parameter types as well:

fun printValue(number:Int){
    println("Number: $number")
}

fun printValue(text:String){
    println("Text: $text")
}