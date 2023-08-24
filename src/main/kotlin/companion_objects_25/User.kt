package companion_objects_25

//  In Kotlin, a companion object is a construct that allows you to define properties and methods
//  that are associated with the class itself rather than with instances of the class.
//  It's similar to static members in other programming languages,
//  but it provides more flexibility and can also implement interfaces and inherit from other classes.

class User(var firstName: String, var lastName: String) {

//    companion object is a func or property  that directly tied to class rather
//    than to its exact instance

    companion object {
        val users = mutableListOf<User>()

        fun createUsers(count: Int): List<User> {
            for (i in 1..count) {
                users.add(User("FirstName$i", "LastName$i"))
            }
            return users
        }

        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }

    fun getFullName():String = "$firstName $lastName"
}