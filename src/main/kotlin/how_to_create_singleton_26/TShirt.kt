package how_to_create_singleton_26

object TShirt {

    var color:String? = null
    var price:Double? = null

    var name:String? = null

    fun printDetails(){
      println("Details: Name: $name | Color: $color and Price: $price INR")
    }
}