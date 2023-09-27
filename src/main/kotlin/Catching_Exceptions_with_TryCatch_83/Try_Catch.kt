package Catching_Exceptions_with_TryCatch_83

import java.lang.Exception

fun main(){

    val person = Person("Mohan",15)

//  Using this line below, will through an exception
//  We can wrap it inside  try/catch block
//  checkAge(person)

    try {

      checkAge(person)

    }catch (ex:Exception){
        println("Exception handled gracefully:  $ex")
    }

}

// Think that this is from different library. And we can't control it.
private fun checkAge(p:Person){
    if(p.age < 18){
        throw Exception("Not An Adult.")
    }
}

data class Person(val name:String,val age:Int)