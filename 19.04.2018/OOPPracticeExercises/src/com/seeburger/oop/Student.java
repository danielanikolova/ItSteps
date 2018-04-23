package com.seeburger.oop;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	
	private int facultyNumber;
	private String firstName;
	private String secondName;
	private String telephonNumber;
	private String birthDate;
	
	public Student(String facultyNumber,String firstName, 
			String secondName, String telephonNumber, String birthDate ) 
	{
		
		this.setFacultyNumber(facultyNumber);
		this.setFirstName(firstName);
		this.setSecondName(secondName);
		this.setTelephonNumber(telephonNumber);
		this.birthDate = birthDate;
		
	}
	
	public int getFacultyNumber() 
	{
		return this.facultyNumber;
	}
	
	public String getFirstName() 
	{
		return this.firstName;
	}
	public String getSecondName() {
		return this.secondName;
	}
	
	public String getTelephonNumber() 
	{
		return this.telephonNumber;
	}
	
	public String getBirthDate() 
	{
		
		return this.birthDate;
	}
	
	public void setFacultyNumber(String facultyNumber) 
	{
		
		
		this.facultyNumber = Integer.parseInt(facultyNumber);
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public void setSecondName(String secondName) 
	{
		this.secondName = secondName;
	}
	
	public void setTelephonNumber(String telephonNumber) 
	{
		this.telephonNumber = telephonNumber;
	}
	
	public void setBirthDate(String birthDate) {
		
		Pattern pattern = Pattern.compile("\\d{1,2}\\/\\d{1,2}\\/\\d{4}");
		
		Matcher matcher = pattern.matcher(birthDate);
		
		if (matcher.find()) {
			this.birthDate = birthDate;
		}else {
			throw new IllegalArgumentException("Enter correct date formata dd/dd/yyyy");
		}
		
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.firstName).append(" ").append(this.secondName).append("/n");	
		sb.append(String.format("Telephon number: %s /n", this.telephonNumber));
		sb.append(String.format("Faculty number: %s /n", this.facultyNumber));
		
		return sb.toString();
	}
	


}
