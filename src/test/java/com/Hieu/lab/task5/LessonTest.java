package com.Hieu.lab.task5;


import com.Hieu.lab.task4.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalTime;
import java.util.Arrays;

public class LessonTest {
    @Test
    public void lessonTest() {
        Student studentAnna = new Student(1, "Anna");
        Student studentIvan = new Student(2, "Ivan");

        Group groupOp1 = new Group(1, Arrays.asList(studentAnna),"Gr1");
        Group groupOp2 = new Group(2, Arrays.asList(studentIvan),"Gr2");

        Tutor tut1= new Tutor(1, "Malihin");
        Tutor tut2= new Tutor(2, "Golovin");
        Tutor tut3= new Tutor(2, "Sinitca");

        Subject math = new Subject(1, "App Math");
        Subject java = new Subject(2, "Java");
        Subject web = new Subject(3, "Web");

        Lessons op1Lesson1 = new Lessons(1, groupOp1, tut2, java, LocalTime.of(8,0));
        Lessons op1Lesson2 = new Lessons(2, groupOp2, tut3, web, LocalTime.of(9,40));
        Lessons op2Lesson1 = new Lessons(3, groupOp1, tut1, math, LocalTime.of(13,10));

        Schedule schedule = new Schedule(Arrays.asList(op1Lesson1, op1Lesson2, op2Lesson1));

        Assertions.assertEquals(Arrays.asList(op1Lesson1, op2Lesson1), schedule.findLessons(studentAnna));

//        System.out.println(schedule);
    }
}
