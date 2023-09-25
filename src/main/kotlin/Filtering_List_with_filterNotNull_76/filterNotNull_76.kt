package Filtering_List_with_filterNotNull_76

fun main(){
    val names:List<String?> = listOf("Arushi", "Harshan",null, "Madhav", "Utkarsh", "Ummang",null)


    val nameThatAreNotNull = names.filterNotNull()

    println(nameThatAreNotNull)

}