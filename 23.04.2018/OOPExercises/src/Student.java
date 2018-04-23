
public class Student {
	
	private int fNum;	
	private String firstName;
	private String secondName;
	private String faculty;
	
	
	public Student(String firstName, String secondName, int fNum, String faculty) 
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.fNum = fNum;
		this.faculty = faculty;
	}
	
	@Override
	public String toString() 
	{
		
		return String.format("%s %s - %d, %s", this.firstName, this.secondName, this.fNum, this.faculty);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getSecondName() {
		return this.secondName;
	}
	
	


}
