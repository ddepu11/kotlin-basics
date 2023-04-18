fun main() {

    var number = 22

    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE

//    Cant store a value bigger then Int.MAX_VALUE to integer type variable
//    number = 2147483648

//    Cant store a value less then Int.MIN_VALUE to integer type variable
//    number = -2147483649

    println("Int Max: $maxIntegerValue | Int Min: $minIntegerValue")

    val maxByteValue = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE


    println("Byte Max: $maxByteValue | Byte Min: $minByteValue")


    val maxShortValue = Short.MAX_VALUE
    val minShortValue = Short.MIN_VALUE

    println("Short Max: $maxShortValue | Short Min: $minShortValue")


    val maxLongValue = Long.MAX_VALUE
    val minLongValue = Long.MIN_VALUE


    println("Long Max: $maxLongValue | Long Min: $minLongValue")

    val myNumber = 23L


    val myName: String = "Mohan Kumar"
    val age: Int = 23

//  To know type of variable
    println(myName::class)


    val myByte: Byte = 8 // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64 // 64-bit signed integer


}