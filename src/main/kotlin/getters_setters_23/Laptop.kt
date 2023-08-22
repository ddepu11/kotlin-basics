package getters_setters_23

class Laptop(var name:String, var price: Double) {


    var details:String = "Laptop Name: $name and Its Price is $price INR"
        get() = "Details: $field"
        set(value){
            field = "Updated Details: $value"
        }

}