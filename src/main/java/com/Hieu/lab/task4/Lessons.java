package com.Hieu.lab.task4;


import java.time.LocalTime;

public class Lessons {
//    private Group[] groups;
//    private Tutor[] tutors;
//    private String time;
//    private String day;
//
//    public Lessons(Group[] groups, Tutor[] tutors, String time, String day){
//        this.groups = groups;
//        this.tutors = tutors;
//        this.time = time;
//        this.day = day;
//    }
//
//    public void addGroup(Group group) {
//        groups = Arrays.copyOf(groups, groups.length + 1);
//        groups[groups.length] = group;
//    }
//
//    public void addTeacher(Tutor tutor){
//        tutors = Arrays.copyOf(tutors, tutors.length + 1);
//        tutors[tutors.length] = tutor;
//    }
//
//
//    @Override
//    public String toString(){
//        return String.format(Arrays.toString(tutors)+
//                "%n"+"Day: " + day +
//                "%n"+"Time: " +
//                time +"%n");
//    }
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student("Ivan", "App math",  32);
//        Student s2 = new Student("Dima", "App math",  32);
//        Student s3 = new Student("Sasha", "App math",  31);
//        Student s4 = new Student("Max", "App math",  31);
//
//        Group g1 = new Group( new Student[] {s1, s2});//создали группу со студентами s1,s2
//        Group g2 = new Group( new Student[] {s3, s4});
//
//        Tutor tut1 = new Tutor("Kostenko","Math Logic");
//        Tutor tut2 = new Tutor ("Podkolzin","Delphi");
//
//        Lessons les1 = new Lessons(new Group[]{g1},new Tutor[]{tut1},"11:30","Monday");
//        Lessons les2 = new Lessons(new Group[]{g1},new Tutor[]{tut2},"13:10", "Monday");
//
//        Lessons les3 = new Lessons(new Group[]{g2},new Tutor[]{tut2},"11:30", "Saturday");
//        Lessons les4 = new Lessons(new Group[]{g2},new Tutor[]{tut1},"13:10","Wendsday");
//
//
//        System.out.printf("Student:" + s1 + "%n");
//        System.out.printf(les1 +"%n" + les2);
//    }
    private int idLesson;
    private Tutor tutorName;
    private Group groupName;
    private Subject subjectName;
    private LocalTime time;

    public Lessons(int idLesson, Group groupName, Tutor tutorName, Subject subjectName, LocalTime time){
        this.idLesson = idLesson;
        this.groupName = groupName;
        this.tutorName = tutorName;
        this.subjectName = subjectName;
        this.time = time;
    }

    public int getIdLesson() {
        return idLesson;
    }
    public Tutor getTutorName() {
        return tutorName;
    }
    public Group getGroupName() {
        return groupName;
    }
    public Subject getSubjectName() {
        return subjectName;
    }
    public LocalTime getTime() {
        return time;
    }



}
