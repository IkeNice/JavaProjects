package com.Hieu.lab.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpperationsTest {
    private static int sum(int a, int b){
        return a+b;
    }
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

    @Test
    public void twoPlusTwo(){
        Assertions.assertEquals(4, sum(2,2));
    }
    public void counterTest(){
//        Assertions.assertEquals("a - 1", countWords("a aa bc vv cf"));
    }
}
