package data_classes_36

fun main(){
    val p1 =  Person("Mohan","Kumar",23)

    val p2 =  Person("Mohan","Kumar",23)


//    When we don't use data keyword to create class
//    println(p1==p2)
//    println(p1)
//    println(p2)


//    When we use data keyword to create class

    println(p1==p2)

    println(p1)

    println(p1.toString())
    println(p1.hashCode())

    println(p1.equals(p2))

    println(p2.fullName())
    println("Full Name Length: ${p1.fullNameLength()}")


    val p3 = Person()

    println("Person 3 $p3")

}


// When you use data class, kotlin compiler generates,
// equals / hashcode / toString methods for us
// To get Parameter less constructor pass default value in constructor
data class Person(var firstName:String="XYZ", var lastName:String="MNO", var age:Int=0){
    fun fullName() =  "$firstName $lastName"

    fun fullNameLength():Int {
        return fullName().length
    }
}