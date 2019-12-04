package com.Hieu.lab.task4;

import java.util.List;

public class Group {

    private int idGroup;
    private List<Student> students;
    private String groupName;

    public Group(int idGroup, List<Student> students, String groupName){
        this.idGroup = idGroup;
        this.students = students;
        this.groupName = groupName;
    }

    public int getIdGroup(){
        return idGroup;
    }

    public List<Student> getStudents(){
        return students;
    }

    public String getGroupName() {
        return groupName;
    }
}
