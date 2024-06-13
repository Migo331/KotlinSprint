package org.example.lesson_2

fun main() {
    val middle = 50
    val salMiddle = 30000
    val jun = 30
    val salJun = 20000
    val constWorkers = 30000 * 50
    println(constWorkers)
    val summSalary = constWorkers + (salJun * jun)
    println(summSalary)
    val medianSalary = summSalary / (middle + jun)
    println(medianSalary)
}