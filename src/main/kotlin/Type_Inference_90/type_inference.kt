package Type_Inference_90

fun main() {
//  Because we are initializing the name and age, so kotlin is inferring the type of both of them.
    val name = "Mohan Kumar"
    var age = 33

    println(name)
    println(age)

//  Here kotlin cant infer, so we will have to give it a type explicitly.
    lateinit var food: String

    val reversed = nameReversed("Mohan Kumar")

    println(reversed)


    val price1 = 2;
    val price2 = 23.4

    val result = price1 + price2

    println("Result: $result")

}


fun nameReversed(name: String): String {
    return name.reversed()
}

