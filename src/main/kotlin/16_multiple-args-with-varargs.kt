fun main() {
//    printBookInfo("Some Book Name",)

//    With varargs
    printBookInfo("Some Book Name", "JK Rolling", "Some person","New Authors")
    printBookInfo("Ikigae")
}


//fun printBookInfo(title: String, author: String) {
//    println("$title | Author: $author")
//}

// If you want co author then you will have to overload the func
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
