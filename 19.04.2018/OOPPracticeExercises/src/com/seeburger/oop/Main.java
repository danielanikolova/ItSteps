package com.seeburger.oop;

import java.io.File;
import java.io.InputStream;
import java.rmi.ConnectIOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type your first Name!");
		String firstName = scanner.nextLine();
		System.out.println("Type your last Name!");
		String lastName = scanner.nextLine();
		System.out.println("Type your faculty number!");
		String facultyNumber = scanner.nextLine();
		System.out.println("Type your telephon number!");
		String telephonNumber = scanner.nextLine();
		System.out.println("Type your birth date!");
		String birthDate = scanner.nextLine();
		
		Student currentStudent = new Student(facultyNumber, firstName, lastName, 
				telephonNumber, birthDate);
		
		currentStudent.toString();
		
		
		File[] roots = File.listRoots();
		
		for (File root : roots) 
		{
			System.out.println(root.getAbsolutePath());
		}
		
		
		
		

	}
	
	
}
