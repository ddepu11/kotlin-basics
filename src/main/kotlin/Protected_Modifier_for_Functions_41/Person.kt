package Protected_Modifier_for_Functions_41

open class Person(var name:String, var age:Int) {


}


open class Chef(name:String, age:Int, protected var favoriteFood:String):Person(name,age){

    //  Now this method can only be used in Person and The classes that inherit Person class
    protected fun printMyFavoriteFood() = println(favoriteFood)

    fun setMyFavoriteFood(favFood:String){
        favoriteFood = favFood

        printMyFavoriteFood()
    }
}


class NorthIndianChef(name:String,age:Int,var favFood:String):Chef(name,age,favFood){


    init {
        printMyFavoriteFood()
    }

}