package Filtering_and_Transforming_Maps_66

import java.util.*

fun main() {
    val items:MutableMap<String,String> = mutableMapOf(
            "DL" to "Delhi",
            "MH" to "Mumbai",
            "KA" to "Bangalore",
            "AP" to "Hyderabad",
            "TN" to "Chennai",
            "WB" to "Kolkata",
            "GJ" to "Ahmedabad",
            "RJ" to "Jaipur",
            "TN" to "Coimbatore",
            "UP" to "Lucknow"
    )

//   items.forEach{ println("Item ${it.key} : ${it.value}") }

    val isAny = items.any()
    val isEmpty = items.none()

//    println("$isAny")
//    println("Is Empty: $isEmpty")

    val doesItContainsAKey = items.containsKey("OP")

    println("Does It Contains A Key: $doesItContainsAKey")


//    val result = items.filter { it.equals("OP") }
//    val result = items.filterValues { it.contains("A") }

    val result = items.filterValues { value ->
        value.split("")
                    .joinToString{it.lowercase(Locale.getDefault())}.contains("o") }
//                     .map { it.value.substring(0,3) }
                     .mapValues { it.value.substring(0,3) }

    println("Result $result")
}