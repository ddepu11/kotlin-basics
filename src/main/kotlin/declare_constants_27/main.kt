package declare_constants_27


const val MAX_AGE = 18

fun main() {
//    Different ways to declare constants
    val user = User("Mohan", "Kumar")
    user.MAX_AGE

//    Can access  MAX_SCORE like this coz inside a
//    companion object
//    user.MAX_SCORE


//    But we can access it like
//    User.MAX_SCORE



//

    Constants.MAX_AGE
    Constants.MIN_AGE

    println(MAX_AGE)
}