package Passing_Values_to_Lambda_Function_Parameters_93

fun main() {
//  1st example
    repeater(6) {
        if (it < 3) {
            println("Blue Pill")
        } else {
            println("Red Pill")
        }
    }

    println()

//  2nd Example
    declareManOfTheMatch { it ->
        "The winner is ${it}, Congratulation!"
    }

}

fun repeater(repeatTimes: Int, block: (Int) -> Unit) {
    repeat(repeatTimes) { index -> block(index) }
}


fun declareManOfTheMatch(block: (String) -> String) {
    val players = listOf("Virat", "Rohit", "Hardik", "Shubhman", "Ishan", "Shikhar", "Bumrah", "Krunal")

    val winner = players.random()

    val winnerMessage = block(winner)

    println(winnerMessage)

}


