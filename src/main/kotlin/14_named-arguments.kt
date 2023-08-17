// In Kotlin, named arguments allow you to specify
// function parameters by their names rather than their positions.
// This can make your code more readable and maintainable,
// especially when calling functions with multiple parameters or default values.

fun main() {
//    printUserInfo(firstName = "Mohan", lastName = "Kumar", age = 23, isSunburned = false, likesMovies = true, lovesPopcord = false)

//    Mixing Positional and Named Arguments:
//    Using name arguments we can also change the position of it.
//    You can also mix positional and named arguments.
    //  However, once you start using named arguments for one parameter,
    //  all the following arguments must be named:
    printUserInfo(age = 23, likesMovies = true, firstName = "Mohan", lastName = "Kumar",  isSunburned = false,  lovesPopcord = false)

    println("\n")

    logFoodBaughtToday(didYouLike = false, price = 60, location = "Langford Garden, Bengluru", name = "Kulfi icecream")

    println("\n")

    logFoodBaughtToday(didYouLike = true, location = "Richmod Circle, Bengluru", name = "Rava Dosa")

}

fun printUserInfo(
    firstName: String,
    lastName: String,
    age: Int,
    isSunburned: Boolean,
    likesMovies: Boolean,
    lovesPopcord: Boolean
) {
    println("$firstName $lastName age is $age. Sunburned: $isSunburned, Likes Movies: $likesMovies, Likes Popcorn: $lovesPopcord")
}


fun logFoodBaughtToday (name:String,price:Int=100,didYouLike:Boolean,location:String){
     println("You baught $name whose prise was $price and you ${if(didYouLike)"liked" else "disliked"} it, you baught it in $location")
}