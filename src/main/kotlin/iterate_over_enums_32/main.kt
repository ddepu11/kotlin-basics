package iterate_over_enums_32

fun main() {
//    for(accountType in AccountType.values()){
//        println("Account Type: $accountType \n")
//    }


//  Same as above
    AccountType.values().forEach { println("Account Type: $it") }
}


enum class AccountType {
    BRONZE,
    PLATINUM,
    SILVER,
    GOLD
}