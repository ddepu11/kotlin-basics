// In Kotlin, default arguments allow you to specify default values for function parameters.
// This means that if a value is not provided for a particular parameter when the function is called,
// the default value will be used. This can be quite handy when you want to make some function parameters
// optional while providing sensible default values.

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

    println("\n")

    logFavoriteSong(singer = "Udit Narayan", name = "Tu Mere Samne", duration = "6 min", released = "1996")

    println("\n")

    logFavoriteSong(singer = "Kumar Sanu", name = "Mai Tughko Bhaga Laya", duration = "5 min", released = "1993", doYouLikeIt = true, isItAvailableOnSpotify = true)

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


fun logFavoriteSong(name:String,released:String,duration:String,isItAvailableOnSpotify:Boolean=false, doYouLikeIt:Boolean= false, singer:String){
  println("Song Name: $name, Released On: $released, Duration: $duration, It is ${if(isItAvailableOnSpotify)"Available" else "Not Available"} on Spotify, Do You Like: $doYouLikeIt, Singer Name: $singer")
}


