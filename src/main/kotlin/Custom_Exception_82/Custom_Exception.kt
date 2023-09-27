package Custom_Exception_82

fun main(){
    val person = Person("Aman",15)

    if(person.age < 18){
         throw  InvalidAgeException(person.age,"An error occurred!")
    }
}

class InvalidAgeException(var age:Int, message:String):IllegalArgumentException("Invalid age: $age. $message")

data class Person(var name:String,var age:Int)