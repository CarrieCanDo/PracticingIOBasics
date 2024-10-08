package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //use FileInputStream to read a file byte by byte
        String filePath = "C:\\Users\\User\\Carrie\\PracticingIOBasics\\src\\main\\java\\org\\example\\file1.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Writing data to a .txt file using FileOutputStream

        String outputFilePath = "C:\\Users\\User\\Carrie\\PracticingIOBasics\\src\\main\\java\\org\\example\\file1.txt";
        String dataToWrite = "Humpty Dumpty sat on a wall. Humpty Dumpty had a great fall.";

        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            fos.write(dataToWrite.getBytes());
            System.out.println("\nData written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

