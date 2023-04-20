package multiple_properties_in_class_24

class User(var firstName: String, var lastName: String) {

    //    Multiple properties
    var age: Int = 0
    var favoriteColor: String = "Blue"

    fun fullName(): String = "$firstName $lastName"

    fun sayHi() = println("Hi ${fullName()}")


// Class Functions

//fun getFullNameLength():Int   {
//    return "$firstName $lastName".length
//}

    //  Shorter form
    fun getFullNameLength(): Int = "$firstName $lastName".length


    fun isFullNameEmpty(): Boolean = fullName().isEmpty()

    fun updateFullNameWithSuffix(suffix: String) {
        firstName = "$suffix $firstName"
    }
}