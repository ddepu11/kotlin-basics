fun main() {
    var name: String = "Mohan"

//   Cant do this coz name is non null reference.
//   name = null

    var name2: String? = "Gopinath"

    name2

    var age: Number = 23
//    age = null

    var age2: Number? = 23
    age2 = null


    var person: Person = Person("Sahil")
//    person = null


    var person2: Person? = Person("Sahil")
    person2 = null


    var firstName: String = "Hello"
    var length = firstName.length

    var lastName: String? = "Hello"
    var length2 = lastName?.length // ? Safe call


    var length3 = if (lastName !== null) lastName.length else 0

    var length4 = lastName?.substring(0, 2)?.length

    var length5 = lastName?.substring(0, 2)?.drop(5)?.substring(2, 3)?.length


}

class Animal(var name: String)