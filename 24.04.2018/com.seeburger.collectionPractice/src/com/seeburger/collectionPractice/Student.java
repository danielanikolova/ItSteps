package com.seeburger.collectionPractice;

import java.util.List;

import exceptions.InvalidAgeException;
import exceptions.InvalidEmailException;
import exceptions.InvalidGroupException;
import exceptions.InvalidPhoneNumberException;

public class Student {
	
	private long fNumber;
	private String firstName;
	private String lastName;
	private  String email;
	private int age;
	private int group;
	private List<Integer> grades;
	private String phoneNumber;
	
	
	public Student(String fNumber, String firstName, String lastName, 
			String email, String age, String group, List<Integer> grades, String phoneNumber) 
					throws InvalidAgeException, 
					NumberFormatException, 
					InvalidEmailException, 
					InvalidGroupException, 
					InvalidPhoneNumberException
	{
		setfNumber(fNumber);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAge(age);
		setGroup(group); 
		this.grades = grades;
		setPhoneNumber(phoneNumber);
	}
	
	
	public void setfNumber(String fNumber) throws NumberFormatException
	{		
			 this.fNumber = Long.parseLong(fNumber);
		 	
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public void setEmail(String email) throws InvalidEmailException 	{
			
		if (email.matches("[a-zA-Z0-9\\.\\_]+@[a-zA-Z]+\\.[a-zA-Z]+")) {
			this.email = email;
		}else {
			throw new InvalidEmailException("Email adress is not correct.");
		}
		
	}
	
	public void setAge(String age) throws NumberFormatException, InvalidAgeException
	{
		int enteredAge = Integer.parseInt(age);
		
		if (enteredAge<18) 
		{
			throw new InvalidAgeException("Entered age is not correct!");
		}else 
		{
			this.age = enteredAge;
		}
	}
	
	
	public void setGroup(String group) throws NumberFormatException, InvalidGroupException
	{
		int enteredGroup = Integer.parseInt(group);
		
		if (enteredGroup<=0 ||enteredGroup >100) {
			throw new InvalidGroupException("The number of group must be between 1 and 100.");
		}
		else
		{
			this.group = enteredGroup;
		}
		
		
	}
	
	
	public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException
	{
		if (phoneNumber.matches("([\\+]359|00359)\\d{8}")) {
			this.phoneNumber = phoneNumber;
		} else {
			throw new InvalidPhoneNumberException("Phone number format is not correct.");
		}
		
	}


	public int getGroup() {
		
		return this.group;
	}


	public String getName() 
	{
		return this.firstName + this.lastName;
	}
	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		
//		
//		return super.toString();
//	}
	
	
	

}
