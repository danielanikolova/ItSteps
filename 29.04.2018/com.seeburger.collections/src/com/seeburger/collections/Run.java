package com.seeburger.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) throws IOException {
		
		
		   Scanner scanner = new Scanner(System.in);
		   BufferedReader br = new BufferedReader(new FileReader("StudentData.txt"));
		   CommandExecutor commandExecutor = new CommandExecutor(br);
		   Collection<Student> arr;
		   Map<Integer, Student> map;
		   
		   System.out.printf("Hello, your file contains information about company employees. %n"
		   + "What information you want to get for your specific needs.%n "
		   + "Please select a type of collection according to your needs.%n ");
		    
		   System.out.printf("Please enter: %n"
		   + "--- 1 to print all employyes names.%n" //Array list
		   + "--- 2 to print all employyes names by order of input.%n" //Linked list
		   + "--- 3 to print all unique names.%n"// Hash set
		   + "--- 4 to print all unique names by order of input.%n"// Linked Hash Set
		   + "--- 5 to print all names by faculty number and by order of input of faculty number.%n"// Hash Map
		   + "--- 6 to print all names by faculty number and by order of input of faculty number.%n" //Linked Hash Map
		   + "--- 7 to print all names by faculty number. faculty numbers are ordered in ascending order%n");// Tree Map

		   
		 try { 
		 int choise;
		 
		 do
		 {
			System.out.println("Choose: ");
			 choise = Integer.parseInt(scanner.nextLine());
		
		 }
		 while(choise>7||choise<1);
		 
		 if (choise>=1 && choise<=4) 
		 {
			
			 arr = commandExecutor.fillCollectionFrom(choise);
			 printCollection(arr);
			 
		}
		 else 
		{
			map = commandExecutor.fillMapFromFile(choise);
			printMap(map);
		}
		 
		 
		 
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		}finally {
			scanner.close();
		}
		
		   
	   }

	
	private static void printMap(Map<Integer, Student> map) {
		
		for (Integer fNumber : map.keySet()) {
			System.out.println(fNumber + " -> " + map.get(fNumber));
		}
		
	}


	private static void printCollection(Collection<Student> arr) {
		for (Student student : arr) {
			System.out.println(student.toString());
		}
		
	}

	

}
