package for_each_loops_60

import java.util.*

fun main() {

    val people  = listOf(Person("Adiyta"),Person("Ankit"),
        Person("Alok"),Person("Julian"))

//  With Typical for loop
    for(person in people){
//        println("Name: ${person.name}")
    }

// New way
//  people.forEach { println("New Way ${it.name}")  }


    people.map { it.name.split("").joinToString("")
           .uppercase(Locale.CHINA) }
           .forEach {  println("Reversed: ${it.reversed()}") }


}

class Person(var name:String){

}