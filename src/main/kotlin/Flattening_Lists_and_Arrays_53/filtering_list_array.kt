package Flattening_Lists_and_Arrays_53

fun main() {

    val mine:List<String> = listOf("Mango","Banana","Apple")
    val theirs:List<String> = listOf("Oranges","Pears","Strawberries")
    val others:List<String> = listOf("Kiwi", "Watermelon")

//  List of lists
    val ours:List<List<String>> = listOf(mine,  theirs, others)

    println(ours)
    println(ours.flatten())

    println("Arrays\n")

//  We can flatten an array as well.
    val mineArray:Array<String> = arrayOf("A","B","C")
    val theirsArray:Array<String> = arrayOf("M","N","O")
    val othersArray:Array<String> = arrayOf("X","Y","Z")

    val allArray:Array<Array<String>> = arrayOf(mineArray,theirsArray,othersArray)


    allArray.forEach { it.forEach {item-> print(item) } }
    println()
    println(allArray.flatten())
}