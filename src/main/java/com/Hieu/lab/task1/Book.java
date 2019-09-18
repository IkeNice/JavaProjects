package com.Hieu.lab.task1;

public class Book{
    private static String author= "Name";
    private static String book = "name ";
    private static int pages = 150;

    public static void main(String[] args){
        print(author, book, pages);
    }

    private static String print(String authorName, String bookName, int numPages){
        System.out.println("Имя автора - " + authorName);
        System.out.println("Название книги - " + bookName);
        System.out.println("Колличество страниц - " + numPages);
        return null;
    }
}
