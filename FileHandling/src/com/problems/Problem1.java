package com.problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Problem1 {
public static void main(String[] args) {

//String text ="""
//		        Roses are red
//                violets are blue
//                Booty Booty Booty
//                Rockin Everywhere
//                """;
	String fileName ="input.txt";
	String text = "I like Burger. Buy me a burger";
	
	try(FileWriter writer = new FileWriter(fileName);){
		writer.write(text);
		System.out.println("File Wrtten Successfully");
	}
	catch(FileNotFoundException e) {
		System.out.println("Could not found file location");
	}
	catch(IOException e) {
		System.out.println("cannot Write File");
	}
	
	int characterCount = 0;
	int lineCount = 0;
	int wordCount = 0;
	try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
		System.out.println("The File Exist");
		String line;
		while((line = reader.readLine()) != null) {
			characterCount +=line.length();
			characterCount ++;
			lineCount++;
			String[] words= line.trim().split("\\s+");
			if(!line.isBlank()) {
				wordCount += words.length;
			}
		}
		System.out.println("Total words in file " + wordCount);
		System.out.println("Total characters in file : " + characterCount);
		System.out.println("Total number of lines : " + lineCount );
	}
	catch(FileNotFoundException e) {
		System.out.println("Could not found file ");
	}
	catch(IOException e) {
		System.out.println("cannot Write File");
	}
	
	
}
}

