package how_to_create_singleton_26

fun main() {
//    I want to restrict it so  only one instance of FavoriteFood
//    class can be created.

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
//    one instance properties are being chaged
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