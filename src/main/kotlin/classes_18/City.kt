package classes_18

class City {
    var name:String = ""
    var famousFor:String = ""

    fun logNameAndFamousFor (){
        println("$name City is famous for $famousFor")
    }

    fun changeCityName (newName: String){
        name = newName
    }

    fun justLogTheCity(){
        println("Your City is $name")
    }

    fun lengthOfName(){
        println("Length of City Name: ${name.length}")
    }


}