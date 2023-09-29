package Lazy_Initializer_Block_88

import kotlin.random.Random

// In Kotlin, you can use a lazy initializer block to create a property that is initialized only when it is first accessed.
// This can be particularly useful when you have a property that is expensive to compute, and you want to defer its initialization until it's actually needed.
// The lazy function is used for this purpose.
fun main() {

    val result: Lazy<Int> = lazy {
        someExpensiveFunction()
    }

    println(result)
    println("Is Initialized: ${result.isInitialized()}")

    println(result.value)
    println(result.value)
    println(result.value)

}

fun someExpensiveFunction(): Int {
    println("computed")
    Thread.sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}

// This lazy initialization is a handy way to optimize your code by deferring the initialization of properties until they are actually needed,
// which can improve performance in some cases.