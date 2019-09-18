package com.Hieu.lab.task2;


public class WordsCounter{
    private static String stri = "a aa cva a bv";
    private static String simb = "a";
    public static void main(String[] args) {
        countWords(stri, simb);
    }
    public static int countWords(String str, String c)
    {
        int count = 0;
        for (String st : str.split(" ")) {
            if (c.equals(st)) {
                count++;
            }
        }
        System.out.println("Количество вхождений: " + count);
        return 0;
    }
}
