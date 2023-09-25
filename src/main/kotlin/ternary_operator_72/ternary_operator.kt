package ternary_operator_72

fun main(){
    val name:String? = "Mohan Kumar"

//  So Kotlin does not have a ternary operator, you will have to use the single line if statement
    val nameLength = if(name!==null) name.length else 0

    println("Name Length: $nameLength")

}