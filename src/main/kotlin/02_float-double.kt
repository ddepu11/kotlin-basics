fun main() {
//    Float and double are used when you want to store fractional numbers

//    By default its double
//    val myNumber = 45.5

//    Cant give type to the variable like this coz the 45.5 infered as double type
//    val myNumber:Float = 45.5


//  solution of above
    val myNumber = 42f

//  Double type variable
//  Double has more precision

    val mySecondNumber = 65.2


    print("My Number: $myNumber | My Second Number: $mySecondNumber")

    val myInt: Int = 32 // 32-bit signed integer

    //    decimals
    val myFloat: Float = 32.00F // 32-bit floating point number
    val myDouble: Double = 23.4 // 64-bit floating point number

//    All these above are objects

    println(myFloat.toDouble())


    val bigLong: Long = 1_000_000 // this is easier to read , coz of underscore
    println("Big Long: $bigLong")


    val newInt = myInt.minus(12)
    println("New Int: $newInt")
}
