package companion_objects_25

class User(var firstName: String, var lastName: String) {

    //    companion object is a func or property  that directly tied to class rather
//    then to its exact instance
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