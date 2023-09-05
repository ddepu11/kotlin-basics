package static_methods_to_enums_33

fun main(){
    val accountName = AccountType.getAccountTypeByName("GoLd")

    println("$accountName")

    val accountName2 = AccountType.getAccountTypeByName("PlatInuM")

    println("$accountName2")

}

enum class AccountType {
    BRONZE,
    PLATINUM,
    GOLD,
    SILVER;

    companion object {
        fun getAccountTypeByName(name:String) = name.split("").joinToString("") {

            it.replaceFirstChar(Char::uppercase)

        }
    }
}