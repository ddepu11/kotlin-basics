package Iterating_over_a_List_with_an_Index_62

fun main() {
    val people = listOf(Person("Nilesh"),
                        Person("Gopal"),
                         Person("Ajay"),
                         Person("Shivam"),
                         Person("Rudra")
    )


    people.forEachIndexed{index,person-> println("Index: ${index +  1 } | Person: ${person}") }
}
 
data class Person(var name:String){

}
