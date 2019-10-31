package com.Hieu.lab.task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputFile {
    public static void main(String[] args) throws Exception {
        try {
            InputStream in = new FileInputStream("1.txt");
            while (in.available() > 0) {
                System.out.println(in.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You catch this exeption" + e);
            throw e;
//            new Exception(" ",e);
        } finally {
            
        }
    }
}
