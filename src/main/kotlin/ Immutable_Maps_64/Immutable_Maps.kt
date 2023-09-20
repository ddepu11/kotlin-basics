package ` Immutable_Maps_64`

fun main(){
    val states:Map<String,String> = mapOf("MP" to "Madhya Pradesh",
        "HR" to "Haryana",
        "AP" to "Andhra Pradesh",
        "CH" to "Chhattisgarh",
        "UP" to "Utter Pradesh ",
        )

//    val result = states.get("HR")
//    OR
    val result = states["UP"]

//    val result = states.get("PL")
//    val result = states.getOrDefault("PL","Default-Value")
//    val result = states.getOrDefault("PL","Unknown-Value")
//    val result = states.getOrElse("PL") { "ELSE Value" }

//    println("$result")

    val containsValue = states.containsValue("Chhattisgarh")

    println("Contains Value | $containsValue")

    val containsKey = states.containsKey("HR")

    println("Contains Key| $containsValue")


//    val result1 = states.entries
    val result1 = states.keys

    println(result1)

}
