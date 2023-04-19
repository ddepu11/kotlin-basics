fun main() {
    printUserInfo2("Agrit")
    printUserInfo2("Mohan", 23)

    printUserInfo2("Mohan", 23, "Blue")
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

