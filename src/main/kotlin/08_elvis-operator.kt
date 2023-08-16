fun main() {

//    In Kotlin, the Elvis operator (?:) is used like this:
//    val result = nullableValue ?: defaultValue

    /*
    * Here's how it works:

    If nullableValue is not null, the result will be assigned the value of nullableValue.
    If nullableValue is null, the result will be assigned the value of defaultValue.
    *
    * */

    val name: String? = null
    val displayName = name ?: "Guest"

    println("Display Name: $displayName")



    var lastName:String? = "Mishra"

//  var length6: Int = lastName?.length
//  How to fix this we want length6 to be a type of Int

//  Solution
    var length: Int = if (lastName !== null) lastName.length else 0

//  Another Solution : using elvis operator

//  If lastName?.length is null return  0
    var length2: Int = lastName?.length ?: 0

}