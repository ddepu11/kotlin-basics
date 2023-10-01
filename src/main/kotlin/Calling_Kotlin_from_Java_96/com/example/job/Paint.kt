package Calling_Kotlin_from_Java_96.com.example.job

import Calling_Kotlin_from_Java_96.com.example.odd.PaintService

fun main(){
    var paintService:PaintService = PaintService()

    val employee = paintService.employeePaintSomething("Jignesh",23)

    println(employee.name)
    println(employee.age )

    val employees = paintService.processedEmployies()

    employees.map { println(it) }
}
