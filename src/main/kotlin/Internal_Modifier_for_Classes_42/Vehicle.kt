package Internal_Modifier_for_Classes_42

// In Kotlin, the internal modifier is used to specify that a class, function, property,
// or other declaration is visible within the same module. A module in Kotlin is typically
// a collection of Kotlin files compiled together, which can be roughly compared to an assembly
// in C# or a package in Java.

// This helps in encapsulating implementation details while still allowing access within the same module
// for modular and maintainable code organization.


internal class Axle(val noOfWheel:Int) {
}


open class Vehicle(var color:String) {

    private lateinit var axle:MutableList<Axle>

    fun info(){
        println("Vehicle Color is $color")
    }

    fun addAxel(numberOfWheels:Int){
        axle.add(Axle(numberOfWheels))
    }


//  Cant expose the axle like this. Because Axle is internal
//    fun getAxcelInfo():List<Axle>{
//
//        return axle
//    }
}


class Truck(color:String):Vehicle(color){
    init {
        addAxel(4)
        addAxel(6)
    }
}