package com.Hieu.lab.task2;

public class WordsCounter {
    public static void main(String[] args) {
        String strl = "asd as as";
        countWord(strl);
    }
    public static int countWord (String text) {
        int  c = 0, a=0;
        String[] words = text.trim().split(" ");
        for(String word : words){
            System.out.println(word+": "+simpleWord(words,word));
        }
        return 0;
    }

    private static int simpleWord(String[] words, String findWord) {
        int count=0;
        for(String word : words){
            if (word.equals(findWord)) {
                count++;
            }
        }
        return count;
    }
}
