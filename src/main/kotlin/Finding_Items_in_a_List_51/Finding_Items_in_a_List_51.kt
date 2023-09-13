package Finding_Items_in_a_List_51

import java.util.*

fun main(){
    val names:List<String> = listOf("Mohan","Sohan","Abhi","om","Jaspal","Ummang")

//
//    val result:String? = names.find { it =="XYZ" }

//    It can throw: NoSuchElementException
//    val result:String? = names.first{ it =="XYZ" }

//    val result:String? = names.firstOrNull{ it =="XYZ" }
    val result:String? = names.lastOrNull{ it.lowercase(Locale.getDefault()).contains("bh") }

    println(result?.length)



//  val result:List<String> = names.filter { it !="Ummang" }
//    val result:List<String> = names.filter { it.lowercase(Locale.getDefault()).contains('m') }


//    println(result)
}