package com.hank;

import com.hank.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudendTest {
    @Test
    public void hihgtTest(){
        Student student = new Student("hank",60,80);
        Assertions.assertEquals(80,student.highest());

    }
    @Test
    public void averageTest(){
        Student student = new Student("hank",60,80);
        Assertions.assertEquals((60+80)/2,student.getAverage());
    }
}
