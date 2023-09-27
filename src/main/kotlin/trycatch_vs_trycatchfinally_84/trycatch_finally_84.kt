package trycatch_vs_trycatchfinally_84

import java.lang.Exception
import java.lang.IllegalStateException

fun main(){
    val person = Person("Kirtan",17)

//  Finally will always be called, but it's not guaranteed that the catch will be called as it is based on the
//  Type of exception

    try {
       checkAge(person)
    }catch (ex:IllegalArgumentException){
        println("Reached catch block!")
    }finally {
        println("Reached Finally!")
    }
}


fun checkAge(person:Person){
    if(person.age < 18){
        throw IllegalArgumentException("Not an adult!")
    }
}
data class Person(val name:String, val age:Int)