package Using_filterNot_on_List_52

fun main() {
    val names:List<String> = listOf("Mohan", "Sohan", "Rohan", "Arun", "Mohit")

//  returns element who don't have an
    val result = names.filterNot {  it.contains("an") }

//  println(result)

//  FilterTo and Filter Not to

    val approved:MutableList<String> = mutableListOf("Mohan", "Sohan")
    val newNames:List<String> = listOf("Abhi", "Swetabh","Arun","Somil","Ronak","Sunny")

//  Filter To: Whatever element have n in it add it to the approved array
//  newNames.filterTo(approved) { it -> it.contains("n") }

//  Filter NotTo: Add all the element who does not match in approved variable
    newNames.filterNotTo(approved) { it.contains("a") }

    println(approved)

}