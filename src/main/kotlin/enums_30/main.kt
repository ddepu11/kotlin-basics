import enums_30.User

fun main(){

    println(AccountType.PLATINUM)
    println("")

    val accountTypeFromAPI = "silver"

    val matchedAccountType = AccountType.valueOf(accountTypeFromAPI.split("").joinToString("") {

        it.replaceFirstChar(Char::uppercase)
    })

    println("Matched Account Type: $matchedAccountType")
    println("")

    var user = User("Mohan", "Kumar",AccountType.GOLD)

    println("")

    println("Blue Hex Code: ${Colors.BLUE.hexCode}| Is Dark: ${Colors.BLUE.isDark}")
    println("White Hex Code: ${Colors.WHITE.hexCode}| Is Dark: ${Colors.WHITE.isDark}")

    val newVal = Colors.valueOf("Orange".split("").joinToString("") {it.replaceFirstChar(Char::uppercase)  })

    println("New Val: $newVal")
    println("Is Dark: ${newVal.isDark} | Hex: ${newVal.hexCode}")
}


enum class AccountType {
     BRONZE,
     GOLD,
     SILVER,
     PLATINUM
}

enum class Colors(val hexCode:String,val isDark:Boolean = true) {
    RED("#FF0000",true),
    ORANGE("#FFA500",false),
    PINK("#FFC0CB",true),
    BLUE("#0000FF",false),
    WHITE("#FFFFFF",false)
}