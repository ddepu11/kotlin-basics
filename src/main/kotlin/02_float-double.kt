fun main() {
//    Float and double are used when you want to store fractional numbers

//    By default, its double
//    val myNumber = 45.5

//    Cant give type to the variable like this coz the 45.5 inferred as double type
//    val myNumber:Float = 45.5


//  solution of above
    val myNumber = 42.5f

//  Double type variable
//  Double has more precision

    val mySecondNumber = 65.2


    println("My Number: $myNumber | My Second Number: $mySecondNumber")

    val myInt: Int = 32 // 32-bit signed integer

    //   decimals
    val myFloat: Float = 32.00F // 32-bit floating point number
    val myDouble: Double = 23.4 // 64-bit floating point number

//    All these above are objects

    println("MyFloat is object ${myFloat.toDouble()}")


    val bigLong: Long = 1_000_000 // this is easier to read , coz of underscore
    val newBigLong:Long = 9_847_2973 // _ makes it easier to read

    println("Big Long: $bigLong | New Big Long: $newBigLong")


    val newInt = myInt.minus(12)
    val aNewValue = 75.plus(25.5)
    println("New Int: $newInt | A Value: $aNewValue")
}
