package Protected_Modifier_for_Functions_41

fun main() {
  val person = Person("Mohan Kumar", age = 1234)
  val chef = Chef("Mohan Kumar", age = 1234,  favoriteFood = "Poha")

//  printMyFavoriteFood method can only be used in This and The classes that inherit this class
//  person.printMyFavoriteFood()
//  chef.printMyFavoriteFood()

  chef.setMyFavoriteFood("Dosa")


  val northInidianChef = NorthIndianChef("Mukesh",45, favFood = "Roti")

}

