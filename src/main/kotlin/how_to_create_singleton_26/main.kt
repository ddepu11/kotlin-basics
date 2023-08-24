package how_to_create_singleton_26

// A singleton is a design pattern used in software engineering to ensure
// that a class has only one instance and provides a global point of access to that instance. In Kotlin,
// you can implement the singleton pattern using a combination of a private constructor and a companion object.

fun main() {
//    I want to restrict it, so only one instance of FavoriteFood class can be created.

//    val x = FavoriteFood()
//    val y = FavoriteFood()

//    To do that we will use object instead of class

    println(FavoriteFood.name)

    FavoriteFood.name = "Mango"

    println(FavoriteFood.name)

    FavoriteFood.ingredients.add("turmeric powder")
    println(FavoriteFood.ingredients.first())
    println(FavoriteFood.numberOfIngredients())

    doSomething()

    println(FavoriteFood.name)
    println(FavoriteFood.ingredients.firstOrNull())

    println(FavoriteFood.numberOfIngredients())

    println(FavoriteFood ===  FavoriteFood)
//    So there is only one instance of FavoriteFood and only that
//    one instance properties are being changed


    println("\n")

    TShirt.name = "XYZ"
    TShirt.color = "black"
    TShirt.price = 478.00

    TShirt.printDetails()

    changeTShirtDetails("ABC", color = "RED", price = 300.00)

    TShirt.printDetails()

}

fun doSomething() {
    FavoriteFood.name = "Chapati"

    FavoriteFood.ingredients.clear()
}

object FavoriteFood {
    var name: String = "Unknown"
    val ingredients = mutableListOf<String>()


    fun numberOfIngredients(): Int {
        return ingredients.size
    }
}



fun changeTShirtDetails (name:String,price:Double,color:String){
    TShirt.name = name
    TShirt.price = price
    TShirt.color = color
}