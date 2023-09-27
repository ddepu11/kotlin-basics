package Throwing_Exceptions_81

import java.lang.Exception

fun main(){
//    val person = Person("Mohan",23)
    val person = Person("Zakir",16)

    if(person.age > 18){
        println("Person is above 18, Person Age: ${person.age}")

    }else{
        throw  Exception("User is not old enough!")
    }

}

data class Person(val name:String,val age:Int)