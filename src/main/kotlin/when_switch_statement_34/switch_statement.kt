import when_switch_statement_34.User

fun main(){
    val user1 = User("Johan", "Kumar")

    when(user1.firstName){
        "Mohan"->{
            println("This is Mohan")
        }
        "Rohan"->{
            println("This is Rohan")
        }

//      Default Case i.e else
        else -> {
            println("Did match with anything.")
        }


    }
}