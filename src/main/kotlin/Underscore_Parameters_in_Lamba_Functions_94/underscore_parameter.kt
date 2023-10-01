package Underscore_Parameters_in_Lamba_Functions_94

fun main() {
//  When we want to declare a variable but don't want to use it, so you use underscore.
    randomKannadWord(4) { _, word ->

        println(word)
    }
}


val kannadWords = listOf(
    "ಹುಟ್ಟು",
    "ಹಕ್ಕಿ",
    "ಮನೆ",
    "ಮಿತ್ರ",
    "ಪ್ರೀತಿ",
    "ಬೆಳಕು",
    "ನೀರು",
    "ಅನ್ನ",
    "ಕಾಡು",
    "ಪ್ರಕೃತಿ",
    "ಬಾಲ",
    "ವಯಸ್ಸು",
    "ಶಿಕ್ಷಣ",
    "ಪರ್ವ",
    "ಪ್ರವಾಸ",
    "ಮುಖ",
    "ಕೈ",
    "ಕಾಲ",
    "ಗಿಡ",
    "ಹೂ",
)

fun randomKannadWord(noOfTimes: Int, block: (Int, String) -> Unit) {
    repeat(noOfTimes) {
        val word = kannadWords.random()
        block(it, word)
    }
}