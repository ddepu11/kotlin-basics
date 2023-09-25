package Double_Bang_Operator_73

fun main(){
    val name:String? = "Arpit"

//  !! Mark basically says that its value will be non null
    val nameLength = name!!.length

    println("Name Length: $nameLength")

    val person1:Person? = Person("Mohan Kumar")

//  !! Indicates that person1 value will not be null
    println(person1!!.name)

}


class Person(var name:String)