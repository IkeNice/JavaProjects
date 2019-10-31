package com.Hieu.lab.task4;

public class Student {
    private String name;
    private int groupNum;

    public Student(String name, int groupNum){
        this.name = name;
        this.groupNum = groupNum;
    }
    @Override
    public String toString(){
        return String.format("%n" + "Name: " +name + ". Group: " + groupNum);
    }
}
