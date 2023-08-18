package class_primary_constructors_19

class Car(var carName:String,var fuelCapacity:Int,var price: Double, var passengerCapacity:Int,var economy:Int) {


    val nameAndEconomy = "Name: $carName | Economy: $economy"

    fun printCarDetails(){
        println("Car Details: Card Name $carName, Fuel Capacity: $fuelCapacity L, Price: $price, Passenger Capacity: $passengerCapacity, Economy: $economy KM/L")
    }

    fun nameAndEconomy():String{
        return nameAndEconomy
    }


}