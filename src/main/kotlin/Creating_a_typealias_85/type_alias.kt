package Creating_a_typealias_85

typealias AuthToken = String
fun main(){

    val user = User("mohan11","K@AHJK_#*@HU^@#&^&SAJGA*@&#@*")

//  So basically your created a Type alias "AuthToken",
//  Now you don't need to give authToken as string every time
//  Instead you can use  AuthToken

}

data class User(val userName:String, val authToken:AuthToken)

data class Account(val authToken: AuthToken)

data class Order(val authToken: AuthToken)