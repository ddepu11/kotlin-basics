package lateinit_modifier_28

class User(var firstName:String,var lastName:String) {

//  I am going to initialize it later but before using it, or it will throw error
//  It cant be used with val
    lateinit var favoriteCity:String;

    var fullName:String = "$firstName $lastName"

    override fun toString():String{
        return "Full Name: $fullName and Favorite City is: $favoriteCity "
    }
}