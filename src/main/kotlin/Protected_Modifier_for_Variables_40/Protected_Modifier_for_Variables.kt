package Protected_Modifier_for_Variables_40


fun main() {
    val p = Person("John", age = 25)

//    p.favoriteFood = "Watermelon"

    val chef = Chef("Ranjit", 25,"Palak Sabji")

    p.printMyFavoriteFood()

    println("")

    chef.printMyFavoriteFood()
    chef.setMyFavoriteFood("Sea Food")
    chef.printMyFavoriteFood()

}