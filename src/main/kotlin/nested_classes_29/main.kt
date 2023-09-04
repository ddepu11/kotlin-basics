package nested_classes_29

fun main(){


 val vehicle  = Vehicle()

 vehicle.brand = "WolksVagon"

 vehicle.info()

    println("\n")

  val sw = Vehicle.SteeringWheel()
    println("Steering Wheel name:  ${sw.name}")
    sw.info()

  val transmission = Vehicle.Transmission()
    println("type ${transmission.type}")

  transmission.shift()

//    Using inner class

//    Can use inner class like below, need to use the reference of the vehicle obj
//    val engine = Vehicle.Engine()


    val engine = vehicle.Engine()

    engine.capacity = "4 L"

    engine.details()
}