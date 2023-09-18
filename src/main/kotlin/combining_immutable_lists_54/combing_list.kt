package combining_immutable_lists_54

fun main() {
    val listOne = listOf("1","2","3")
    val listTwo = listOf("4","5","6")
    val listThree = listOf("7","8","9")

    val result:List<String> = listOne.plus(listTwo).plus(listThree)

    println(result)

    println(result.minus(listTwo))
}