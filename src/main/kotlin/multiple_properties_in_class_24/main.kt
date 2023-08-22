package multiple_properties_in_class_24

fun main() {

//    Multiple properties
    val user = User("Krunal", "Pandaya")

    user.age = 30
    user.favoriteColor = "Green"

    user.sayHi()

//    Class functions

//    println(user.getFullNameLength())

//    println(user.isFullNameEmpty())

    user.updateFullNameWithSuffix("Mr.")

//    println(user.fullName())

    val city1 = City(name = "Jabalpur","Narmada River",false)


    city1.famousPlace = "Bhedaghat, Dhuadhar"
    city1.noOfPonds = 30

    println(city1.fullDetails)

    println("Famous Place: ${city1.famousPlace}")
    println("No of ponds: ${city1.noOfPonds}")


    city1.changeFamousFor("Orange")
    city1.changeCityName("Nagpur")
    city1.makeMetroAvailable()


    println(city1.forCityIsFamousFor())
    println(city1.getCityName())


}