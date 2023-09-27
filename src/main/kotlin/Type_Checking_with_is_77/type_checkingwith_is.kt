package Type_Checking_with_is_77

// Link to the article
// https://medium.com/@m.sandovalcalvo/kotlin-type-system-unveiling-the-mystery-50613f0db893#:~:text=It%20is%20important%20to%20remember,and%20generics%20are%20composed%20types.
fun main() {

    val age:Any = 32

//  val obj:Any = Person("Bunny ")

//  Replicating an api call
    val obj:Any = replicatesAnApiCall("3")

//  Try it with Int, String, Double etc
    if(obj is Any ){
        println("It is !")
    }else{
        println("It is not. ")
    }

//  To get the type of the variable
    println("Object variable type:  ${obj.javaClass.name}")
    println("Age variable type:  ${age.javaClass.name}")
}

data class Order(val amount:Int)

class Person(val name:String )


fun replicatesAnApiCall(value:String):Any{
    return when (value){
        "1"-> 2
        "2"-> "Mohan"
        "3"-> 14.5
        "4"-> true
        else -> false
    }
}