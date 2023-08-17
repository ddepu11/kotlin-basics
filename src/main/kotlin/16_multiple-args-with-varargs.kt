// In Kotlin, you can use the vararg modifier to define a parameter that accepts
// a variable number of arguments of the same type.
// This is useful when you want to pass a varying number of arguments to a function.
// The vararg parameter behaves like an array of the specified type.

fun main() {
//    printBookInfo("Some Book Name",)

//    With varargs
    printBookInfo("Some Book Name", "JK Rolling", "Some person","New Authors")
    printBookInfo("Ikigae")

    println("\n")

    foodInPriceRange("40-100","Dosa","Idli","Parantha","Chawal")
}


//fun printBookInfo(title: String, author: String) {
//    println("$title | Author: $author")
//}

// If you want co-author then you will have to overload the func
// And if you want another then again overload.
//fun printBookInfo(title: String, author: String, coAuthor: String) {
//    println("$title | Authors: $author , $coAuthor")
//}


//  Instead we can use varargs
//  authors is now array
fun printBookInfo(title: String, vararg authors: String) {
    println("$title | Author: ")

    authors.forEach { println(it) }
}


fun foodInPriceRange(priceRange:String,vararg foods:String){
    println("Price Range: $priceRange INR")
    println("Food under this price range.\n")

    foods.forEach { food-> println("$food") }

}