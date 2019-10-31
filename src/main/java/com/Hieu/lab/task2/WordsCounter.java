package com.Hieu.lab.task2;

public class WordsCounter {
//    private static String simb = "aa";
    public static void countWords(String str) {
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

    private static int find(String[] words, String findWord) {
        int count=0;
        for(String word : words){
            if (word.equals(findWord)) {
                count++;
            }
        }
        return count;
    }
    public static int countChar (String text)
    {
        int  c = 0, a=0;
        String[] words = text.trim().split(" ");
        for(String word : words){
            System.out.println(word+": "+find(words,word));
        }
        return 0;
    }
    public static void main(String[] args) {
        //countWords(stri);
        String stri = "a a a a aa bc vv cf";
        String[] part = stri.split(" ");
        int len = part.length;

//        System.out.println("string: "+stri);
//        for (int i = 0; i < len; i++) {
//            System.out.println("part["+i+"]: "+part[i]);
//        }

// удаление дубликатов
        String[] checkDup = new String[len];
        int j = 0;
        checkDup[j] = part[0];
        for(int i = 1; i < len; i++){
            if(!checkDup[j].equals(part[i])){
                j++;
                checkDup[j] = part[i];
            }
        }
//        for (int i = 0; i < len; i++) {
//                System.out.println("checkDup[" + i + "]: " + checkDup[i]);
//        }

    }

}
