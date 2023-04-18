fun main() {
//    var is used to create mutable variable
//    val is used to create read only variable

//  var's can be reassigned
    var userName: String = "Mohan Kumar"
    userName = "Dhanush"
    userName = "Puneet"


//  val's can not be reassigned
    val email: String = "mohan@gmail.com"
//    email = "dhanush@gmail.com"
//    email = ""

    println("Is email Empty?  ${email.isEmpty()}")

    var age: Int = 23
    age = 25
//    age = "22"

    println("Hello $userName, you email is $email your age is $age")
}
