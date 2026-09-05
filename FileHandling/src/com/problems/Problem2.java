package com.problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class Problem2 {
	public static void main(String[] args) throws IOException {

        String file1Name = "source.txt";
        String file2Name = "destination.txt";

        String text = "I am very Innocent, and a nice person";

        // Write some data to source.txt
        try (FileOutputStream fos = new FileOutputStream(file1Name)) {
            fos.write(text.getBytes());
        }
        
        File destinationFile = new File(file2Name);

        if (!destinationFile.exists()) {
            destinationFile.createNewFile();   
            System.out.println("destination.txt did not exist → created new file!");
        }

//      copy
        try (
            FileInputStream fis = new FileInputStream(file1Name);
            FileOutputStream fos2 = new FileOutputStream(destinationFile)
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos2.write(byteData);
            }
            System.out.println("File copied successfully!");
        }
    }
}
