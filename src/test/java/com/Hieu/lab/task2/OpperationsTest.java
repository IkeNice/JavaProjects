package com.Hieu.lab.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpperationsTest {
    private static int sum(int a, int b){
        return a+b;
    }

    public static int countWord (String text)
    {
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
    @Test
    public void twoPlusTwo(){
        Assertions.assertEquals(4, sum(2,2));
    }
    @Test
    public void WordCount(){
        String text = "asd asd the why";
//        Assertions.assertEquals(2, countWords.countWord["asd"]);
    }
}
