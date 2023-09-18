package Lists_vs_maps_55

import java.util.*

fun main() {
     val items:List<String> = listOf("Apple","Sony","Samsung","Nokia","Motorola")

     val abbreviations =
         items.map { it.substring(0,3).split("").joinToString("").uppercase(Locale.getDefault()) }
//             .sumOf { it.length }
//             .filter { it.contains("O") }
             .filterNot { it.contains("O") }
             .reversed()

//   println(abbreviations)

    val people = listOf(Person("Mohan"),Person("Sohan"),Person("Anubhav"),Person("Surekha"))


   val peopleResult =  people.map { it.name }
//       .map { it.length }

    println(peopleResult)

}


class Person(val name:String){
}