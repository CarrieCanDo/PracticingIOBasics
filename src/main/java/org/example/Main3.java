package org.example;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {

        String inputFilePath = "C:\\Users\\User\\Carrie\\PracticingIOBasics\\src\\main\\java\\org\\example\\file1.txt";
        String outputFilePath = "C:\\Users\\User\\Carrie\\PracticingIOBasics\\src\\main\\java\\org\\example\\file2.txt";

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(inputFilePath));
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(outputFilePath))) {

            int charData;

            while ((charData = inputStreamReader.read()) != -1) {
                outputStreamWriter.write(Character.toUpperCase(charData));
            }
            System.out.println("Data converted to uppercase and written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
