fun main() {
    var name: String = "Mohan" // non-nullable reference that can only hold a String

//   Cant do this because name is non-null reference. name can not be null
//   name = null

    var name2: String? = "Gopinath" // nullable reference that can hold a String or null

    name2 = null

    var age: Number = 23 // non-nullable reference that can only hold an Int
//    age = null

    var age2: Number? = 23 // nullable reference that can hold an Int or null
    age2 = null


    var person: Person = Person("Sahil") // nullable reference that can only hold a Person object
//    person = null


    var person2: Person? = Person("Sahil") // nullable reference that can hold a Person object and null
    person2 = null


    var firstName: String = "Hello"
    var length = firstName.length

    /*
    * Safe Call Operator (?.): This operator allows you to safely access properties
    *                          or call methods on a nullable reference. If the reference is null,
    *                          the expression evaluates to null rather than throwing a null pointer exception.
    * */

    var lastName: String? = "Kumar"
    var length2 = lastName?.length // ? Safe call


    var length3 = if (lastName !== null) lastName.length else 0

    var length4 = lastName?.substring(0, 2)?.length

    var length5 = lastName?.substring(0, 2)?.drop(5)?.substring(2, 3)?.length

    /*
    * Here's the step-by-step explanation: for length5

1. lastName?.substring(0, 2): This extracts the substring from index 0 to index 2 (exclusive) of the lastName. In this case, it results in "Ku".

2. "Ku".drop(5): The drop() function removes the first 5 characters from the string. Since "Ku" has only 2 characters,
    dropping 5 characters results in an empty string.

3. "".substring(2, 3): Attempting to extract a substring from an empty string using indexes 2 to 3 results in the mentioned exception,
      because there are no characters in the empty string at those indexes.


To fix this, you need to adjust the index values to match the lengths of the strings at each step. Here's the corrected code:

kotlin
Copy code
var lastName: String? = "Kumar"
var length5 = lastName?.substring(0, 2)?.drop(2)?.substring(0, 1)?.length

println(length5) // Output: 1
In this corrected version, the indexes are adjusted to work with the length of the string at each step, and the output will be 1, which represents the length of the final substring "m."






    * */


}

class Animal(var name: String)