fun main() {

    helloWorld()
    helloWorld()

    greet(null)
    greet("Good Morning")
}


fun helloWorld (){
    println("Hello from helloWorld function")

    moo()
}


fun moo(){
    println("Moooooooo....!!!!")

}

fun greet(wish:String?){
    println("I greet you with ${wish?:"none"}")
}