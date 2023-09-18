package Map_vs_FlatMap_56

fun main(){
    val groceryBags = listOf(
        ShoppingBag(listOf("Onion","Soy Chunks","Cheese","Paneer")),
        ShoppingBag(listOf("Milk","Bread","Tshirt","Deo")),
        ShoppingBag(listOf("Facewash","Perfume","Bag","Books")),
     )

    val retailBags  = listOf(
        ShoppingBag(listOf("Laptop","Mouse","CDs")),
        ShoppingBag(listOf("Shose","Pants","Pendrive")),
        ShoppingBag(listOf("CPU","Power Bank","Smartphone"))
    )

    val  groceries = groceryBags.flatMap { it.items }

    println(groceries)

    val otherThings = retailBags.map { it.items }

    println(otherThings)

}


class ShoppingBag(val items:List<String>){
}