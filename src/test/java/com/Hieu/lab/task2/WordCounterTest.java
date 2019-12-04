package com.Hieu.lab.task2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.Hieu.lab.task2.WordsCounter.simpleWord;

public class WordCounterTest {

    @Test
    public void wordCountTest(){
        String strl = "asd as as";
        String[] words = strl.trim().split(" ");
        Assertions.assertEquals(1, simpleWord(words, "asd"));
        Assertions.assertEquals(2, simpleWord(words, "as"));
        Assertions.assertEquals(0, simpleWord(words, "sometext"));
    }

}
