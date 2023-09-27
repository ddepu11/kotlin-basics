package trycatch_vs_trycatchfinally_84

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

fun main(){
    val person = Person("Kirtan",17)

    try {
       checkAge(person)
    }catch (ex:IllegalStateException){
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