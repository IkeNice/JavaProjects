package com.Hieu.lab.task2;

public class WordsCounter {
    private static String stri = "a aa bc vv cf";
//    private static String simb = "aa";
    private static void countWords(String str) {
        int count = 0;
        String[] part = str.split(" ");
        int len = part.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (!part[i].equals(" ")) {
                    if (part[i].equals(part[j])) {
                        count++;
                        part[j] = " ";
                    }
                }
            }
            if (!part[i].equals(" "))
                System.out.println(part[i] +" - " + (count+1));
            count=0;
        }
        if (!part[len-1].equals(" "))
            System.out.println(part[len-1] +" - " + 1);
    }
    public static void main(String[] args) {
        countWords(stri);
    }

}
