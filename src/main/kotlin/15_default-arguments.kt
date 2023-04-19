fun main() {

    printUserInfo1(
        age = 23,
        likesMovies = true,
        firstName = "Mohan",
        lastName = "Kumar",
        isSunburned = false,
        lovesPopcord = false
    )
    printUserInfo1(
        age = 43,
        firstName = "Rohit",
        lastName = "Sahu",
    )
    printUserInfo1(
        age = 43,
        firstName = "Bob",
        lastName = "Builder",
        likesMovies = false,
        lovesPopcord = false, favoriteColor = "Red"
    )

    printUserInfo1(
        firstName = "Hwllo",
        lastName = "askj",
        age = 34
    )

}

fun printUserInfo1(
    firstName: String,
    lastName: String,
    age: Int,
    isSunburned: Boolean = false,
    likesMovies: Boolean = true,
    lovesPopcord: Boolean = true,
    favoriteColor: String = "Blue"
) {
    println("$firstName $lastName age is $age. Sunburned: $isSunburned, Likes Movies: $likesMovies, Likes Popcorn: $lovesPopcord, Favorite Color: $favoriteColor")
}