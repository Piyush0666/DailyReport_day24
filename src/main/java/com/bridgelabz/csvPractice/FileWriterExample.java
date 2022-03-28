package com.bridgelabz.csvPractice;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("testout.txt");
            fw.write("This message will read by fileWriter");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}