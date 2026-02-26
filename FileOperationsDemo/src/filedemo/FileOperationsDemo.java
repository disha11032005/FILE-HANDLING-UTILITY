/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filedemo;
import java.io.*;
/**
 *
 * @author Disha
 */
public class FileOperationsDemo {
    public static void writeToFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Welcome to Java File Handling.");
            bw.newLine();
            bw.write("This file is created using Java.");
            bw.newLine();
            bw.write("File operations are easy!");

            bw.close();
            System.out.println("File written successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing file: " + e);
        }
    }

    public static void readFromFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e);
        }
    }

    public static void modifyFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("This line is added later (file modified).");

            bw.close();
            System.out.println("File modified successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while modifying file: " + e);
        }
    }

    public static void main(String[] args) {
        String fileName = "sample.txt";

        writeToFile(fileName);
        readFromFile(fileName);
        modifyFile(fileName);
        readFromFile(fileName);
    }
}
