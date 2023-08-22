package multiple_properties_in_class_24

class City(var name:String, var famousFor:String,var metroAvailable:Boolean) {

    var fullDetails:String = "Details: City name is $name and it is famous for $famousFor and there is ${if(metroAvailable) "a metro available" else "no metro"}."

    var famousPlace:String? = null
    var noOfPonds:Int? = null

    fun forCityIsFamousFor():String = "City is famous for $famousFor"

    fun getCityName():String = "City name is $name"

    fun changeCityName(newName:String) {
        name = newName
    }

    fun changeFamousFor(newFamousFor:String){
        famousFor = newFamousFor
    }

    fun makeMetroAvailable() {
        metroAvailable = true
    }

}