package declare_constants_27

class User(var firstName: String, lastName: String) {
//  Constants

//  MAX_AGE is scoped to the instance of this class
    val MAX_AGE = 18;

    companion object{
        const val MAX_SCORE:Int = 100

//  This cant be accessed outside of this class
//  private const val MAX_SCORE:Int = 100
    }

//    MAX_AGE is private to the scope of the class
//    private val MAX_AGE = 18;
}