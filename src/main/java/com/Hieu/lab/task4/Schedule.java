package com.Hieu.lab.task4;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Lessons> lessons;

    public Schedule(List<Lessons> lessons){
        this.lessons = lessons;
    }

    public List<Lessons> findLessons(Student student) {
        List<Lessons> lessons1 = new ArrayList<>();
        for (Lessons lesson : lessons) {
            for (Student student1 : lesson.getGroupName().getStudents()) {
                if (student1.getName().equals(student.getName()))
                    lessons1.add(lesson);
            }
        }
        return lessons1;
    }
}
