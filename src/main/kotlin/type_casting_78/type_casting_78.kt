package type_casting_78

fun main() {
  // Type Casting
    val obj:Any = replicateAnApi("5")

//  Smart Cast as? If it can convert it, It will convert, or it will return null

//  val casted:Int? = obj as? Int
//  val casted: String? = obj as? String

    val casted:Person = obj as Person

    println("Casted $casted")

    val x: Any = 5
    val y: String? = x as? String

    println(y)
}



fun replicateAnApi(value:String):Any{
    return when(value){
        "1" -> 1
        "2" -> 2.5
        "3" -> false
        "4" -> Person("Arun Pal")
        "5" -> "1"
        else -> {
            return "Mohan"
        }
    }
}

data class Person (var name:String)