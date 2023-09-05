package funtion_abstract_31

fun main(){
    println("Main Function")

    var fromAPI = "gOlD"

    var accountType = AccountType.valueOf(fromAPI.split("").joinToString("") { it.replaceFirstChar(Char::uppercase)  })

    println(accountType.calculateDiscountPercent())
}

enum class AccountType{
    BRONZE{
        override fun calculateDiscountPercent(): Int {
            return 34
        }
          },
    PLATINUM{
        override fun calculateDiscountPercent()= 203
            },
    GOLD{
        override fun calculateDiscountPercent() = 12
        },
    SILVER {
        override fun calculateDiscountPercent() = 12
    };

    abstract fun calculateDiscountPercent():Int
}