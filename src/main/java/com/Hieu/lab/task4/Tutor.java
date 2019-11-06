package com.Hieu.lab.task4;

public class Tutor {
    private String name;
    private String lesson;

    public Tutor(String name, String lesson){
        this.name = name;
        this.lesson = lesson;
    }
    @Override
    public String toString(){
        return String.format("Tutor's Name: " + name + ". Lesson: " + lesson);
    }
}
