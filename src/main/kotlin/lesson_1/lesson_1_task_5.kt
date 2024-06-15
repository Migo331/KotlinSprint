package org.example.lesson_1

import java.time.LocalTime


fun main() {
    val seconds = 6480
    val minute = seconds % 60
    println(minute)
    val minutes = seconds / 60
    println(minutes)
    val hour = minutes / 60
    println(hour)
    val hours = minutes % 60
    println(hours)
    val time = "${hour}:${hours}:${minute}"
    println(time)
}



