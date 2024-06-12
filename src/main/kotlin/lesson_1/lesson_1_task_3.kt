package org.example.lesson_1

import java.time.LocalTime

fun main() {

    val year = 1961;
    var hour: Int = 9;
    var minute: Int = 7;

    println(year)
    println(hour)
    println(minute)

    hour = 10;
    minute = 55;

    println(LocalTime.of(hour,minute))

}