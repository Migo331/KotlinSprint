package org.example.lesson_1

import java.time.LocalTime



fun main() {


    val seconds = 6480
    val minutes = seconds/60
    val hours = minutes/60
     println(LocalTime.of(minutes,hours,seconds))





}



