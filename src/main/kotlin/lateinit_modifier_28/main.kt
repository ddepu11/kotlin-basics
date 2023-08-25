package lateinit_modifier_28

fun main() {
    var user1 = User("Mohan","Kumar")
    user1.favoriteCity = "Mumbai"

    println(user1.toString())
}