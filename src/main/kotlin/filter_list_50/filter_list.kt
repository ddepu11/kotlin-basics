package filter_list_50

fun main() {

    val cities:List<String> = listOf("A","art","AMS","BH","JBP","MUMB","DEL","KLK","JLD")

    val filteredCities1:List<String> = cities.filter { it!=="AMS" }


//    println("Filtered Cities\n")

//    filteredCities1.forEach{println(it)}

//    println("Filtered Cities \n")

    val filteredCities2:List<String> = cities.filter { it==="AMS" }

//    filteredCities2.forEach{println(it)}


    val ages:List<Int> = listOf(23,54,65,10,3,53,7,13,24,21)

    val adults:List<Int> = ages.filter { it > 18 }
    val notAdults:List<Int> = ages.filter { it < 18 }


//    adults.forEach { println(it) }

//    println("Non Adults \n")

//    notAdults.forEach { println(it) }


    val over40 = adults.filter(::isOver40)

    over40.forEach { println(it) }

}


fun isOver40(age:Int):Boolean{
    return age > 40
}