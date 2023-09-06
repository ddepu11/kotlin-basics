package Protected_Modifier_for_Variables_40

open class Person(var name:String, var age:Int) {

//    protected: only visible from the current class
    protected var favoriteFood:String = "unknown"

    fun info(){
        println("This person name $name and his age is $age")
    }

    fun printMyFavoriteFood() = println(favoriteFood)
}


class Chef (name:String,age:Int,favFood:String):Person(name,age){
    init {
        favoriteFood = favFood
    }

    fun setMyFavoriteFood(food:String){
        favoriteFood = food
    }
}