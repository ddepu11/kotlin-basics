package List_vs_Set_vs_Map_vs_Sequence_71

fun main() {
//  List
    val list:List<String> = listOf("Mohan","Sohan","Rohan","Mukesh")


//  Set
//  For unique items
    val set:Set<String> = setOf("Arun","Pooja","Tushar","Ankit","Ankit")

    println("SET: $set")

//  Map: key value pairs
    val map:Map<Int, String> = mapOf(1 to "Gujrat",2 to "Chennai", 3 to "Bhopal",4 to "Chandigarh", 5 to "Punjab")

//  Sequence
//  For more highly performant, when you have very large list
    val sequence = sequenceOf(1,2,3,4,5,6,7,8,9)

//  We can convert a list and map to sequence as well
    list.asSequence()
    map.asSequence()

//  We can convert a sequence to list as well
    sequence.toList()

//  Mutable also exists for these above

}