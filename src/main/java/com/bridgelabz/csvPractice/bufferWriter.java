package com.bridgelabz.csvPractice;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class bufferWriter {
    public static void main(String[] args) {
        try
        {
            //Open the FileWriter, Buffered Writer
            FileWriter fw = new
                    FileWriter("TestFile.Txt");
            BufferedWriter WriteFileBuffer = new
                    BufferedWriter(fw);
            //Write Some Text to File
            // Using Buffered Writer
            WriteFileBuffer.write("My name is Piyush Verma");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("working in Bridglabz this will execute");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("working as a developer");
            WriteFileBuffer.newLine();
            // Close both the Writers
            WriteFileBuffer.close();
            //Open the Readers Now
            FileReader fr = new
                    FileReader("TestFile.txt");
            BufferedReader ReadFileBuffer = new BufferedReader(fr);
            // Read the text Written
            // using BufferedWriter
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());
            //Close the Readers
            ReadFileBuffer.close();
        } catch (IOException Ex)
        {
            System.out.println(Ex.getMessage());
        }
    }
}
