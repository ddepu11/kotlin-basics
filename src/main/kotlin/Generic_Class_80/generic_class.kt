package Generic_Class_80

fun main() {

    val listofInts = listOf(1,2,4,3)
    val listOfStrings = listOf("A","B","C","D")
    val listOfPeople = listOf(Person("John")
            , Person("Marc"),
              Person("Mayank"),
              Person("Deepak")
        )

    val evenList = EvenList(listofInts)
    val items = evenList.evenItems()

    println(items)

    val otherResult = EvenList(listOfStrings)
    println(otherResult.evenItems())

    val result3 = EvenList(listOfPeople)

    println("People : ${result3.evenItems()}")
}

class EvenList<T>(val list: List<T>){
    fun evenItems():List<T>{
        return list.filterIndexed{ index,value-> index % 2 == 0}
    }
}


data class  Person (val firstName:String)