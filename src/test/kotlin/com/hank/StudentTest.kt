package com.hank.kotlin

import com.hank.student.kt.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{
    @Test
    fun hightTest(){
        val student= Student("hank",60,80)
        Assertions.assertEquals(80,student.hight())
    }
    @Test
    fun averageTest(){
        val studend=Student("hank",60,80)
        Assertions.assertEquals(60+80/2,studend.getAverage())
    }
    @Test
    fun getAverageTest(){
        val student=Student("hank",60,80)
        Assertions.assertEquals('C',student.grading())
    }
}

