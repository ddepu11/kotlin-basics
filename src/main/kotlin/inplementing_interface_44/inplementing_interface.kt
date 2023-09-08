package inplementing_interface_44


// In Kotlin, an interface is a way to define a contract for classes.
// Interfaces can contain abstract properties and methods that classes implementing the interface must provide concrete implementations for.
// They are used to define a set of functions or properties that multiple classes can adhere to,
// promoting code reusability and ensuring that specific behaviors are implemented.
fun main() {
   //
}

interface Discountable {
    fun discountPercent(): Double

    fun foo():Int

}

class DigitalProduct():Discountable{
    override fun discountPercent(): Double {
        return 23.4
    }

    override fun foo(): Int {
        return 23
    }

}

class GenericToy:Discountable{
    override fun discountPercent(): Double {
        return 0.4
    }

    override fun foo(): Int {
        return 0
    }
}