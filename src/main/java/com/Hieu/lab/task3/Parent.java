//
//  описать факультет, студенты, преподаватели, предмет, расписание, наследование
//  генерация данных в тесте, генерация занятий для студента/преподавателя
//

package com.Hieu.lab.task3;

public abstract class Parent {
    int a = 1;
//    public void print(){
//        System.out.println(a);
//    }
    public abstract void print();

    public static void main(String[] args){
        new Child().print();
    }

}
