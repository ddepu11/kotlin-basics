package multiple_properties_in_class_24

fun main() {

//    Multiple properties
    val user = User("Krunal", "Pandaya")

    user.age = 30
    user.favoriteColor = "Green"

    user.sayHi()

//    Class functions

    println(user.getFullNameLength())

    println(user.isFullNameEmpty())

    user.updateFullNameWithSuffix("Mr.")

    println(user.fullName())

}