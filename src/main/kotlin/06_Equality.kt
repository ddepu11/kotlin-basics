fun main() {
//    Structural
    var name1 = "Mosaic"
    var name2 = "Mosaic"


//   Structural equivalent operator ==
//   This compares type and the content of the variable
//    println(name1 == name2)

//   Structural in-equality operator !=
//    println(name1 != name2)


//    Referential equality
//    var a = 12
//    var b = 12

//    coz every thing in kotlin is object so below
//    should be false but it true
//    Coz numbers, characters and boolean all have
//    special internal representation that is primitive at run time
//    but to us they look like ordinary classes, so == is same as ===
//    when when  using primitives
//    println(a === b)


    var a = Person("John")
    var b = Person("John")

    println(a === b) // false
//    coz they are not same objects

    println(a !== b)

}

class Person(var name: String)