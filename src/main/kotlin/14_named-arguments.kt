fun main() {
//    printUserInfo(firstName = "Mohan", lastName = "Kumar", age = 23, isSunburned = false, likesMovies = true, lovesPopcord = false)
//    Using name arguments we can also change the position of it.

    printUserInfo(age = 23, likesMovies = true, firstName = "Mohan", lastName = "Kumar",  isSunburned = false,  lovesPopcord = false)

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