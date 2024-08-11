package org.example;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        // File reading code with BufferedInputStream
        String filePath = "C:\\Users\\User\\Carrie\\PracticingIOBasics\\src\\main\\java\\org\\example\\file1.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int byteData;
            while ((byteData = bis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // File writing code with BufferedOutputStream
        String outputFilePath = "C:\\Users\\User\\Carrie\\PracticingIOBasics\\src\\main\\java\\org\\example\\file1.txt";
        String dataToWrite = "Humpty Dumpty sat on a wall, Humpty Dumpty had a great fall!";

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {
            bos.write(dataToWrite.getBytes());
            System.out.println("\nData written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
