package getters_setters_23

class User(var firstName: String, lastName: String) {

//  Here we are overriding the get and set implementation of fullName
    var fullName: String = "$firstName $lastName"
        get() = "Full Name: $field"
        set(value) {
            if (value === "Mohan") {
                field = "Mohan Kumar"
            } else {
                field = value
            }

        }

//  field is the backing field for fullName property, field contains the content of
//  full name property.

}