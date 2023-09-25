package Using_requireNotNull_74

fun main(){
//   So instead of double bang operator !! we can use requireNotNull it is same

//    var name:String? = "Subhash"
    var name:String? = null


//    val nameLength = requireNotNull(name).length
// When name is null, then we get "Required value was null." error
// Instead we can use the second argument of the requireNotNull for the custom error message
//    val nameLength = requireNotNull(name) { "Tried to find length of the name but it is null" }.length

//    println("Name Length: $nameLength")


//    val person: Person? = Person("Unnati")
    val person: Person? = null

    val personName:String? = requireNotNull(person){"Person wan null so could not find person name."}.name

}

class Person(val name:String)