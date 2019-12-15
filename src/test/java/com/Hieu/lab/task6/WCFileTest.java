package com.Hieu.lab.task6;

import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WCFileTest {
    @Test
    public void WCFileTest() throws IOException {
        WCFile wordCounterFile = new WCFile("src\\main\\resources\\WCFiles\\");
        assertEquals(2, (int)wordCounterFile.col("hello"));
        assertEquals(2, (int)wordCounterFile.col("world"));
        assertEquals(4, (int)wordCounterFile.col("Some"));
    }
}