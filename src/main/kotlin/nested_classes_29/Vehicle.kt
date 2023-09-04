package nested_classes_29

class Vehicle {

    var brand:String  = "unknown"

    fun info()= println(brand)

    class SteeringWheel{
        var name:String = "Leather"

        fun info() = println(name)
    }

    class Transmission{
        var type = "Automatic"

        fun shift() = println("The Vehicle has shifted.")
    }

//    Inner class
//    To access the member variable of outer class we will have to use the inner class
    inner  class  Engine{
        lateinit var capacity:String

        fun details(){
            println("Engine details: Capacity: $capacity and the brand is $brand")
        }

    }
}