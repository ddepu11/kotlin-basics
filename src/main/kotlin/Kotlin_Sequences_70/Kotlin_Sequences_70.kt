package Kotlin_Sequences_70

import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {

//  Here filter will run for all items then forEach will run for every item
//    listOf("A","B","C")
//        .filter {
//            println("Filter: $it")
//            true
//        }.forEach {
//           println("Foreach: $it")
//        }

//    println("\n#####____$$$$$$\n")

//  Here filter will run then forEach for each item

//    sequenceOf("M","N","O","P")
//        .filter {
//            println("Filter $it")
//            true
//        }.forEach { feI ->
//            println("For each $feI")
//        }


//  Next Example

//    measure {
//
////        val list = generateSequence(1) { it + 1 }
////            .take(100_000)
////            .toList()
//
//        val sequence:Sequence<Int> = generateSequence(1) { it + 1 }
//            .take(100_000)
//
//
//       val result =  sequence.filter { it % 3 == 0 }
//                         .average()
//
//
//       println("Result: $result")
//    }

//  3rd Example
    val list = getListOfCustomers()

//  We can create any map or list to sequence to gain some performance improvements

    measure {

        val result = list.asSequence().filter { it % 3 == 0 }.average()

        println("Result: $result")
    }

}

// To find how much time it is taking to run a block of code
fun measure(block:()-> Unit){
    val nanoTime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanoTime)

    println("$millis ms")
}

// For 3rd Example,
// Suppose this returns a list of Int, and we don't have control over this.
fun getListOfCustomers():List<Int>{
    return generateSequence(1){it+1}
        .take(50_000_000)
        .toList()
}
