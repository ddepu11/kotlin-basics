package class_properties_22

class Mobile(var name:String, var price:Double,var ram:Int) {


    var configuration = "Mobile $name, its price is $price INR and has ram of $ram gb of ram."


//  You can also define read-only properties using the val keyword:
//  Private value
    val configurationLength = configuration.length;


    init {
        println("From Init, Name is: $name")
    }

    fun makeACall(mobileNumber:String){
        println("Making a call to $mobileNumber")
    }

    fun sendSMS(mobileNumber:String, message:String){
        println("Send a message: $message | to $mobileNumber ")
    }

    fun takeAPic(){
        println("Just Took a pic")
    }

    fun updateName(newName:String){
            name = newName
    }

}