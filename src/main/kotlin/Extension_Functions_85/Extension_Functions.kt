package Extension_Functions_85

fun main(){
    val name:String  = "Mohan Kumar"

//  Initials are extension function
    println(name.initials())

    val age:Int = 15

// Is adult is extension function
    println("Is Adult: ${age.isAdult()}")

    val person = Person("Mukesh","Khanna",34)

//  Full name is extension function
    println(person.fullName())
}


