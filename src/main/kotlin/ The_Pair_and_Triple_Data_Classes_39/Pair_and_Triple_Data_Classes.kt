package ` The_Pair_and_Triple_Data_Classes_39`

fun main(){

//  There are Two inbuilt Data classes Pair and Triple
//  val pair:Pair<String, String> = Pair("foo","bar")

//  This is same as above, it's just a syntactic sugar
    val pair:Pair<String, String> = "foo" to "bar"

    println(pair.first)
    println(pair.second)


    println("")
    val triple:Triple<String, Boolean, Double> = Triple("Alex",false,23.54)

    println(triple.first)
    println(triple.second)
    println(triple.third)

}