package Extension_Functions_86


// These are extension functions
fun String.initials():String{
    val values = this.split(" ")

    val firstInitial = values[0].substring(0,1)
    val lastInitial = values[1].substring(0,1)

    return "$firstInitial $lastInitial"
}

fun Int.isAdult(): Boolean {
    return this>=18
}

fun Person.fullName():String{
    return "${this.firstName} ${this.lastName}"
}