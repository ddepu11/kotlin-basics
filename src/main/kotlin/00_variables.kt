fun main() {
//    var is used to create mutable variable
//    val is used to create read only variable

//    var's can be reassigned
    var userName: String = "Mohan Kumar"
    userName = "Dhanush"
    userName = "Puneet"

    var address = "HNo 2664, Punjab Bank Colony, Jabalpur"
    address = "AVS Pg Sudhamnagar, Bengluru"

//    println("The Address: $address")

//  val's can not be reassigned
    val email: String = "mohan@gmail.com"
//    email = "dhanush@gmail.com"
//    email = ""

    val fatherName = "Shyaml Lal"
//    fatherName = "New Name"  // Cant do this coz val is radonly, it can not be reassigned.

    println("Father's Name: $fatherName")


    println("Is email Empty?  ${email.isEmpty()}")

    var age: Int = 23
    age = 25
//    age = "22"


    var designation = "SE-I"
     designation = "SE-II"

    println("Hello $userName, you email is $email your age is $age and designation is $designation")
}
