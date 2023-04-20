package class_properties_22

fun main() {
    val user = User("Umesh", "Singh")

    println(user.fullName)

    user.fullName = "Some one else"

    println(user.fullName)
    user.age = 23

    println(user.age)

}