
fun main(){
    var apiResponse = AccountTypes.SILVER

//  Exhaustive When block
//  When can also return values, and when it returns a value you will have to
//  Handle all the conditions that's Exhaustive When. or it will through error at compile time.
//  But you can bypass that using the else block

   var message =  when (apiResponse) {

       AccountTypes.BRONZE->{
           "Bronz Member access allowed!"
       }

       AccountTypes.GOLD->"Gold Member access allowed!"

       AccountTypes.SILVER->"Silver Member access allowed!"

     AccountTypes.PLATINUM->"Platinum Member access allowed!"

//     By pass Exhaustive When using else
//     Can avoid adding all the conditions
//       else ->{
//           "Reached the default condition!"
//       }
    }


// Even when we don't return, it asks to create it exhaustive
    when(apiResponse){
        AccountTypes.SILVER-> println("A Silver block!")

        else->{
            println("Reached Default!")
        }
    }

    println("Message $message")
}

enum class AccountTypes {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM,
//    ONIX
}