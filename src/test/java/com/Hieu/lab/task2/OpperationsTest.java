package com.Hieu.lab.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpperationsTest {
    private static int sum(int a, int b){
        return a+b;
    }


    @Test
    public void twoPlusTwo(){
        Assertions.assertEquals(4, sum(2,2));
    }
}
