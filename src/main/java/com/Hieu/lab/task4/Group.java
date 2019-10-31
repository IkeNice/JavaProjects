package com.Hieu.lab.task4;

import java.util.Arrays;

public class Group {
    private Student[] students;

    public Group(Student[] students){
        this.students = students;
    }

    public void  addStudent(Student student){
        students= Arrays.copyOf(students, students.length+1);
        students[students.length] = student;
    }
    @Override
    public String toString(){
        return Arrays.toString(students);
    }
    public static void main(String[] args){
        Student s1 = new Student("Ivan", 32);
        Student s2 = new Student("Dima", 32);
        Group g1 = new Group(new Student[]{s1, s2});
//        g1.addStudent(s2);
        System.out.println(g1);
    }

}
