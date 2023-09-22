package Generating_Large_Sequences_68

fun main() {
     val sequence = generateSequence(2) { it +2  }
         .take(40)
         .toList()
    
    println(sequence)

    val result2 = sequence.filter { it % 3 == 0 }.average()

    print("Result2: $result2")

}