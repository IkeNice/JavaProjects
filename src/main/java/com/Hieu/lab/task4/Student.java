package com.Hieu.lab.task4;

public class Student {
    private String name;
    private int groupNum;
    private String lesson;

    public Student(String name, String lesson, int groupNum){
        this.name = name;
        this.lesson = lesson;
        this.groupNum = groupNum;
    }
    @Override
    public String toString(){
        return String.format("%n" + "Student's Name: " +name + ". Group: " + groupNum);
    }
}
