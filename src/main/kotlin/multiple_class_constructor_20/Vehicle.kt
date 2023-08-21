package multiple_class_constructor_20


// In Kotlin, you can define multiple constructors for a class to provide different
// ways of creating objects with varying sets of parameters.
// There are two types of constructors you can define: primary constructors and secondary constructors.

// 1. Primary Constructor
// The primary constructor is defined in the class header after the class name.
// It's used to define the primary set of properties and their initial values.

// 2. Secondary Constructors:
// Secondary constructors are defined using the constructor keyword and provide additional ways to create
// objects with different sets of parameters.
// Each secondary constructor must call the primary constructor using this keyword.
class Vehicle(var type:String, var name:String,var mileage:Int, var isItHybrid:Boolean,var isItElectric:Boolean,var isItPetrol:Boolean) {

    constructor(type:String,name:String,mileage: Int):this (type,name,mileage,false,false,true){
     println("Second Constructor.")
    }

    constructor(name: String,mileage: Int):this(type="2 vehiler",name, mileage,isItHybrid = false, isItElectric = true,isItPetrol=false){
        println("Third Constructor")
    }

}