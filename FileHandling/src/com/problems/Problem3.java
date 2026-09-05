package com.problems;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem3 {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter keyword to search: ");
	        String keyword = sc.nextLine();

	        int count = 0;             
	        int lineNumber = 0;     

	        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

	            String line;

	            while ((line = br.readLine()) != null) {
	                lineNumber++;

	                // Check if line contains keyword
	                if (line.toLowerCase().contains(keyword.toLowerCase())) {

	                    System.out.println("Keyword found on line: " + lineNumber);

	                    // Count how many times keyword appears in the line
	                    int index = 0;
	                    while ((index = line.toLowerCase().indexOf(
	                               keyword.toLowerCase(), index)) != -1) 
	                    {
	                        count++;
	                        index += keyword.length();
	                    }
	                }
	            }

	            System.out.println("\nTotal occurrences: " + count);

	        } catch (IOException e) {
	            System.out.println("Error reading file.");
	        }

	        sc.close();
	    }
}
