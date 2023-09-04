package enums_30

import AccountType

class User(var firstName:String,var lastName:String, var accountType: AccountType  = AccountType.BRONZE) {


    fun fullName() = "$firstName $lastName"

    override fun toString():String {
        return fullName()
    }
}