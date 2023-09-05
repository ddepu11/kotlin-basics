import when_switch_statement_34.User

fun main(){
    val user1 = User("John", "XYZ")
    user1.isMarried = true

//    This looks kind of like switch statement
    when(user1.firstName){
        "Mohan" ->{
            println("This is Mohan")
        }

        "Rohan"->{
            println("This is Rohan")
        }

        "Marc" -> println("This is marc")

//      Default Case i.e else
        else -> {
            println("Did match with anything.")
        }


    }


//    Or we can use like this
    when{
        user1.firstName == "Marc" && user1.isMarried!! ->{
            println("This is mark and he is married")
        }

        user1.firstName =="Mohan" && !user1.isMarried!! ->{
            println("This is Mohan and he is not married")
        }

        user1.lastName == "XYZ"-> println("This user has a ${user1.lastName} surname!")

        else -> {
            println("Reached Default Statement")
        }
    }
}