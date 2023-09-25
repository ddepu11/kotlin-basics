package Using_checkNotNull_75

// In summary, both checkNotNull and requireNotNull serve the purpose of checking for null values and ensuring that you have a non-null value to work with.

// The main difference lies in their intended use cases: checkNotNull is primarily used for checking and converting nullable values,
// while requireNotNull is used for enforcing preconditions and validating input parameters.
// Choose the one that best fits your specific use case.

fun main(){
    val person1:Person? = Person("Anupama")
//  val person1:Person? = null

    if(checkNotNull(person1){"Person is null."}.name === "Anupama" ){
        println("Hey person is not null")
    }else{
        println("Person is null")
    }

}


class Person (var name:String)