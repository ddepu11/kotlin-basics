fun main() {
//    Structural
    var name1 = "Mosaic"
    var name2 = "Mosaic"


//   Structural equivalent operator ==
//   This compares type and the content of the variable
//    println(name1 == name2)

//   Structural in-equality operator !=
//    println(name1 != name2)


//    Referential/identity/reference  equality
    var a = 12
    var b = 12

//    coz every thing in kotlin is object so below
//    should be false, but it is true
//    Coz numbers, characters and boolean all have
//    special internal representation that is primitive at run time
//    but to us, they look like ordinary classes, so == is same as ===
//    when  using primitives
//    println("Referential Equality: ${a === b}")


    var person1 = Person("John")
    var person2 = Person("John")

//    println("Is Person1 Equals to Person2? ${person1 === person2}") // false
//    coz they are not same objects

    println(person1 != person2)

//    In this code, two Person objects, person1 and person2,
//    are created with the same name "John". When you use the != operator to compare these objects,
//    you're testing for structural inequality,
//    which compares the content of the objects. Since the Person class doesn't override the equals() method,
//    the default behavior is used,
//    which is based on referential equality (memory addresses).

//    Since person1 and person2 are two separate objects with different memory addresses
//    (even though they have the same content), the != operator will return true,
//    indicating that they are not structurally equal.


    println(person1 !== person2)

//    Remember that referential equality (===) is about comparing memory addresses and object identity,
//    while structural equality (==) is about comparing the content or structure of objects.

}

class Person(var name: String)