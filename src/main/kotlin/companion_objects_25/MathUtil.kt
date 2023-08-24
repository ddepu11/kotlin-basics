package companion_objects_25

//  In Kotlin, a companion object is a construct that allows you to define properties and methods
//  that are associated with the class itself rather than with instances of the class.
//  It's similar to static members in other programming languages,
//  but it provides more flexibility and can also implement interfaces and inherit from other classes.

class MathUtil {

    companion object {
        fun multiplyTwoNumbers(num1:Int,num2:Int):Int{
            return num1 * num2
        }

        val PI:Double = 3.14

        fun findSmallestNumber(num1:Int,num2:Int):Int{
            if(num1 < num2){
                return num1
            }

            return num2
        }

        fun findTheBiggerNumber(num1:Int,num2:Int):Int{
            if(num1>num2){
                return num1
            }

            return num2

        }

    }

}