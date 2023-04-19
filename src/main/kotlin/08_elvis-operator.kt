fun main() {
    var lastName = "Mishra"

//  How to fix this we want length6 to be a type of Int
//  var length6: Int = lastName?.length

//  Solution
    var length: Int = if (lastName !== null) lastName.length else 0

//  Another Solution : using elvis operator

//  If lastName?.length is null return  0
    var length2: Int = lastName?.length ?: 0

}