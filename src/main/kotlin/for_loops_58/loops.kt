package for_loops_58

fun main(){
    val values = listOf(1,2,3,4,5,6,7,8,9)

//    values.forEach { println(it) }
    for (anIntNumber:Int in values){
//        println(anIntNumber  )
    }

    for (stone in 1 until 10){
//        println("Stone $stone")
    }

//    Or
    val START = 0
    val STOP = 10

    for(sweet in START until  STOP ){
//        println("Sweet $sweet")
    }

//   Step
//   It will increase the number by 3
    for (aNumber in 0 until  100 step 3){
//        println("A number $aNumber")
    }


//  Reverse
    for(value in 100 downTo 0 step 2){
//        println("Value $value")
    }

    val people = listOf(Person("Mohan"),Person("Sohan"),Person("Abhishek"))

    for(person in people){
        println("Person ${person.name}")
    }

}


data class  Person(val name:String)