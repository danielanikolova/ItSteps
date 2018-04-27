package com.seeburger.collectionPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exceptions.InvalidAgeException;
import exceptions.InvalidEmailException;
import exceptions.InvalidGroupException;
import exceptions.InvalidPhoneNumberException;


public class Run {
	
	public static List<Student> studentsInput = new ArrayList<>();
	public static Map<Integer, List<Student>> studentsByGroupNumber = new HashMap<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("StudentData.txt"));
		
		String line = br.readLine();
		String [] tokens;
		Student currentStuden;
		
		List<Student> studentsInput = new ArrayList<>();		
		
		line = br.readLine();		
		
		while (line!=null) 
		{
			
			tokens = line.split("\\s+");
			List<Integer> grades = new ArrayList<>();
			
			grades.add(Integer.parseInt(tokens[6]));
			grades.add(Integer.parseInt(tokens[7]));
			grades.add(Integer.parseInt(tokens[8]));
			grades.add(Integer.parseInt(tokens[9]));
			
			
			try {
				currentStuden = new Student(tokens[0], tokens[1], tokens[2], tokens[3], 
						tokens[4], tokens[5], grades, tokens[10]);
				
//				studentsInput.add(currentStuden);
				addStudentToMap(currentStuden.getGroup(),currentStuden);
				
			} catch (InvalidAgeException e) {
				System.out.printf("The information of student %s is not correct.%n", tokens[0]);
				System.out.println(e.getMessage());
			}catch (NumberFormatException e) {
				System.out.printf("The information of student %s is not correct.%n", tokens[0]);
				System.out.println(e.getMessage());
			} catch (InvalidEmailException e) {
				System.out.printf("The information of student %s is not correct.%n", tokens[0]);
				System.out.println(e.getMessage());
			} catch (InvalidGroupException e) {
				System.out.printf("The information of student %s is not correct.%n", tokens[0]);
				System.out.println(e.getMessage());
			} catch (InvalidPhoneNumberException e) {
				System.out.printf("The information of student %s is not correct.%n", tokens[0]);
				System.out.println(e.getMessage());
			}
			
			line = br.readLine();
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("studentsByGroup.txt", true));
		
		getResultListByGroup(bw);
		

	}

	private static void getResultListByGroup(BufferedWriter bw) throws IOException {
		
		studentsByGroupNumber.entrySet().stream().forEach(g->
		
		{
			try {
				bw.write(String.valueOf(g.getKey()));
				bw.newLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (Student student : g.getValue()) 
			{
				try 
				{
					bw.write(student.getName());
					bw.newLine();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
				
				);
		
		bw.flush();
		bw.close();
		
	}

	private static void addStudentToMap(int group, Student currentStuden) {
		
		if (!studentsByGroupNumber.containsKey(group)) {
			studentsByGroupNumber.put(group, new ArrayList<>());
			studentsByGroupNumber.get(group).add(currentStuden);
		}else {
			studentsByGroupNumber.get(group).add(currentStuden);
		}
		
	}

	

}
