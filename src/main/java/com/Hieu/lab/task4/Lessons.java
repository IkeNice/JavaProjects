package com.Hieu.lab.task4;

import java.util.Arrays;

public class Lessons {
    private Group[] groups;
    private Tutor[] tutors;
    private String time;
    private String day;

    public Lessons(Group[] groups, Tutor[] tutors, String time, String day){
        this.groups = groups;
        this.tutors = tutors;
        this.time = time;
        this.day = day;
    }


    public void addGroup(Group group) {
        groups = Arrays.copyOf(groups, groups.length + 1);
        groups[groups.length] = group;
    }

    public void addTeacher(Tutor tutor){
        tutors = Arrays.copyOf(tutors, tutors.length + 1);
        tutors[tutors.length] = tutor;
    }


    @Override
    public String toString(){
        return String.format(Arrays.toString(tutors)+
                "%n"+"Day: " + day +
                "%n"+"Time: " +
                time +"%n");
    }



    public static void main(String[] args) {

        Student S1 = new Student("Ivan", "App math",  32);
        Student S2 = new Student("Dima", "App math",  32);
        Student S3 = new Student("Sasha", "App math",  31);
        Student S4 = new Student("Max", "App math",  31);

        Group g1 = new Group( new Student[] {S1, S2});//создали группу, в которую поместили студента
        Group g2 = new Group( new Student[] {S3, S4});

        Tutor E1 = new Tutor("Kostenko","Math Logic");
        Tutor E2 = new Tutor ("Podkolzin","Delphi");

        Lessons T1 = new Lessons(new Group[]{g1},new Tutor[]{E1},"11:30","Monday");
        Lessons T2 = new Lessons(new Group[]{g1},new Tutor[]{E2},"13:10", "Monday");

        Lessons T3 = new Lessons(new Group[]{g2},new Tutor[]{E2},"11:30", "Saturday");
        Lessons T4 = new Lessons(new Group[]{g2},new Tutor[]{E1},"13:10","Wendsday");


        System.out.printf("Student:" + S1 + "%n");
        System.out.printf(T1 +"%n" + T2);
    }
}
