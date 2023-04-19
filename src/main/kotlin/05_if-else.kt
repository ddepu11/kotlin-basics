fun main() {

    var calories = 1500;

    if (calories > 2000) {
        println("You have consumed all the calories for today!")
    } else if (calories > 1500) {
        println("You have few more calories left to eat.")
    } else {
        println("You still have some calories left for today.")
    }


    val age = 9


    if (age > 10)
        println("The age is greater then 10.")
    println("Hello World") // This is not a part of if else

    val myAge = 34
    val yourAge = 34

    val myName = "Mohan"
    val yourName = "Mohan"




    if (myAge !== yourAge && myName !== yourName) {

        println("AND: Both conditions are true!")
    } else {
        println("AND: Both conditions are not true!")

    }

    if (myAge !== yourAge || myName !== yourName) {

        println("OR: Atleast one conditions is true!")
    } else {
        println("OR: Both conditions are not true!")

    }

}