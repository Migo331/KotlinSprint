package org.example.lesson_2

fun main() {
    val trainMin = 9
    val trainSec = 39
//    val currentTime = "${trainMin}:${trainSec}"
//    println(currentTime)
    val wayTime = 457
    val arrivingHour = 457 / 60
    println(arrivingHour)
    val arrivingMinute = 457 % 60
    println(arrivingMinute)
    println(arrivingMinute)
    val arriving = "${trainMin + arrivingHour}:${trainSec + arrivingMinute}"
    if (trainSec + arrivingMinute > 60) {
        println(trainSec + arrivingMinute - 60)
    }
    println(arriving)
}