fun main() {
    doSomeWork(23, "Mohan", true)
    doSomeWork(43, "Ajay", false)
//    doSomeWork(6, "Dhruv", true)

    println("\n")

    logFoodPreference("Dosa",55,true)
    logFoodPreference("Whole Thali",655,false)
}

// Parameter something that we can pass to a function
fun doSomeWork(age: Int, name: String, isHappy: Boolean) {
    println("Your age is $age and name is $name")

    if (age < 21) {
        println("Age is not greater then 21")
    } else {

        println("You are old enough")
    }

    println("Are you happy? $isHappy")

}

fun logFoodPreference(name:String, price:Int, wasItGood:Boolean){
    println("You ordered $name!")

    if(price>500){
        println("$name was little bit expensive!")
    }else{
        println("$name was not expensive!")
    }

    println("$name was ${if(wasItGood)"good" else "not good"}!")
}