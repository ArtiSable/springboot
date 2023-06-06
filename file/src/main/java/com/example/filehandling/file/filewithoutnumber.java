package com.example.filehandling.file;

import java.io.*;

public class filewithoutnumber {
    public static void main(String[] args) {
       
    	String sourceFilePath = "C:\\Users\\ADMIN\\Documents\\firstfile.txt";
        String destinationFilePath = "C:\\Users\\ADMIN\\Documents\\secondfile.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                if (Character.isDigit((char) data)) {
                    continue; 
                }
                bufferedOutputStream.write(data);
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();

            System.out.println("content copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

