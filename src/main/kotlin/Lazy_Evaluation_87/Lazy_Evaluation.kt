package Lazy_Evaluation_87

// Lazy evaluation is a programming concept that defers the evaluation of an expression until the result is actually needed.
// In Kotlin, you can implement lazy evaluation using the by lazy property delegate.
// This delegate allows you to initialize a property only when it is first accessed.
fun main(){
    val name:String by lazy {
        println("Computed.")
        Thread.sleep(3000,1)
        "Mohan Kumar"
    }

//  So it is computing the name only once here in line no 11,
//  And After that on line no 14 and 15 it's just getting computed value.
    println(name)  // This is where the lazy block is executed for the first time

    println(name)
    println(name)
}

// This can be useful for optimizing performance and resource usage in cases where you have expensive or time-consuming operations that don't need to be performed until the value is actually used.