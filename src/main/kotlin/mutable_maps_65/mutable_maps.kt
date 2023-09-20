package mutable_maps_65

fun main(){
    val items   = mutableMapOf<Int,String>(
                    1 to "Chrome",
                    2 to "Edge",
                    3 to "Safari",
                    4 to "Mozilla",
                    5 to "Opera",
        )

//    println(items)

//    items.put(6,"Brave")

//    OR
    items[6] = "Brave"

//   println(items)

    items.remove(4)

//   println(items)


//   When you want to update the value of a key but don't to override if already there.
//   When key is already there
//    val result = items.putIfAbsent(6,"MNO")

//   When key is not there
//   val result = items.putIfAbsent(4,"XYZ")

//    println("Result: $result")
//    println(items)

//     Remove
//      val result = items.remove(1)

//    Remove if the value to that key equals to

//     val result = items.remove(1,"In")

//      println("Result : $result")


//  Give me value for the key 12 if empty, then put Chrome and return it
//    val result = items.getOrPut(12) { "KNAKNS" }
//    print("Result $result")
    println(items)

    items.clear()

    println(items)


}