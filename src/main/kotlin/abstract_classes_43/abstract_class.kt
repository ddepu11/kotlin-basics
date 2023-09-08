package abstract_classes_43

fun main() {
//  Not Allowed to create the instance of the abstract class
//  val vehicle1 = Vehicle("Black")
//  val vehicle2 = Vehicle("Red")
//  val vehicle 3 = Vehicle("White ")


    val townCar = TownCar("Red",3,4)
    val hatchBackCar = HatchBackCar("Red",3)

    townCar.openDoor()
    townCar.drive()
    townCar.turnOffIgnition()
    townCar.stop()
    println("Town Car's Max Speed: ${townCar.maxSpeed}")

    println("")

    hatchBackCar.openDoor()
    hatchBackCar.drive()
    hatchBackCar.turnOffIgnition()
    hatchBackCar.stop()
    println("Hatch Back Car's Max Speed: ${hatchBackCar.maxSpeed}")

}