package com.Hieu.lab.task8.SimpleChat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Start writing message...");
        try{

            Socket s = new Socket("localhost",8000);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String msgin="", msgout="";
            while (!msgout.equals("end")){
                msgout = br.readLine(); // read client msg
                dout.writeUTF(msgout);
//                msgin = din.readUTF();
//                System.out.println(msgin); // print server msg
            }

        }catch(Exception e){

        }
    }
}
