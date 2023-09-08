package abstract_classes_43


// In Kotlin,
// an abstract class is a class that cannot be instantiated directly but serves as a blueprint for other classes.
// Abstract classes are used when you want to define a common structure for a group of related classes,
// but you don't want instances of the abstract class itself.
// Abstract classes can contain abstract and non-abstract (concrete) properties and methods.
abstract  class Vehicle(var color:String,val noOfWheels:Int,noOfDoors:Int) {
//  drive is abstract coz every car drive in his own way, so other Vehicles inheriting this class
//  Will have to implement the drive function
    abstract fun drive()

    abstract fun stop()

//  We can say each car opens a door and turn off ignition in same way, so other Vehicles inheriting this class
//  Will not have to implement these two they can just use them.
    fun openDoor() = println("Opens the door.")
    fun turnOffIgnition ()= println("Ignition turned off.")

// Abstract property (must be overridden by subclasses)
    abstract val maxSpeed:Int
}

// Implementing an abstract class

abstract class TwoDoorCar(color:String,noOfWheels:Int):Vehicle(color,noOfWheels, 2){
    abstract fun driveFast()

//  Abstract class can also override the abstract class
    override fun stop(){
        println("Stops the TwoDoor Car")
    }
}



class HatchBackCar(color:String,noOfWheel:Int):TwoDoorCar(color,noOfWheel){
    override fun driveFast() {
       println("This Hatch Back Car Drives Fast")
    }

    override fun drive() {
        println("Hatch Back Car Drives Normally")
    }

    override val maxSpeed: Int = 120

}

class TownCar(color:String,noOfWheels:Int,noOfDoors:Int):Vehicle(color,noOfDoors,noOfWheels){
    override fun drive() {
        println("Town Car Drives Normally")

    }

    override fun stop() {
        println("Stops the Town Car")
    }

    override val maxSpeed: Int = 150
}