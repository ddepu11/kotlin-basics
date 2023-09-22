package Using_mapNotNull_on_a_Map_67

fun main() {
   val items = mutableMapOf<String,String>(
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

//  Map can return null as well
//  val result = items.map ( ::findValInWebService )

//  Instead, we can use mapNotNull it will not include null

    val result = items.mapNotNull(::findValInWebService)

    println(result)
}

fun findValInWebService(entry: Map.Entry<String,String>): Map.Entry<String, String>? {
//    return if(entry.key.startsWith("J")){
//        null
//    }else{
//        entry
//    }
   if(entry.key.startsWith("M")){
       return null
   }else{
       return entry
   }
}