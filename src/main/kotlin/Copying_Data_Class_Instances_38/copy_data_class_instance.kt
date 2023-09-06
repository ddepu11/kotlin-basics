package Copying_Data_Class_Instances_38

fun main() {

    val person1 = Person("Pawan","Singh",23)

//  Creating the copy of the data
    val sibling = person1.copy()
    println(person1)
    println(sibling)

//  Can also change some props
    val sibling2 = person1.copy(firstName = "Mrunal", age = 23)
    println(sibling2)


    val order = Order(amount = 24, costumer = sibling2)

    println(order)

//  New amount but with same costumer.
    val newOrder = order.copy(amount = 200)

    println("New Order $newOrder")

//  Same order but with different costumer
    val newOrder2 = order.copy(costumer = person1)
    println("New Order 2 $newOrder2")

//  Note: This is not a deep copy, (this is shallow copy)
//  If we copy list that will not be copied.


}

data class Order(val amount:Int,val costumer:Person)

data class Person(val firstName:String,val lastName:String, val age:Int)