package com.example.filehandling.file;

import java.io.*;
import java.util.Scanner;

public class writefile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\output.txt");

            System.out.println("Enter text (press Q to quit):");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("Q")) {
                byte[] content = input.getBytes();
                fileOutputStream.write(content);
                fileOutputStream.write(System.lineSeparator().getBytes());
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            scanner.close();
        }
    }
}

