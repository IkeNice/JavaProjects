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
        outPut(lessons1);
        return lessons1;
    }
    public void outPut(List<Lessons> lessons){
        for(Lessons lesson: lessons){
//            System.out.println("\t |" + lesson.getDayOfWeek() + "|");
            System.out.println("\t --------------------------------");
            System.out.println("\t " + lesson.getSubjectName());
            System.out.println("\t " + lesson.getTime());
            System.out.println("\t " + lesson.getGroupName().getGroupName());
            System.out.println("\t " + lesson.getTutorName().getName() );
            System.out.println();
        }
    }
}
