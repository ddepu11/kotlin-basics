package Measuring_Performance_69

import java.sql.Timestamp
import java.util.concurrent.TimeUnit

fun main(){


    measure {

        val sequence = generateSequence(1) { it + 1 }
            .take(1000)
            .toList()

        val result = sequence.filter { it % 2 == 0 }
            .average()

        println("Done $result")

    }


}

fun measure(block: ()-> Unit ) {
    val start = System.nanoTime()
    val millis = TimeUnit.NANOSECONDS.toMillis(start)
   println("$millis ms")
}