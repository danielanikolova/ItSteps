import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Run {

	public static void main(String[] args) throws IOException {
	
		
//		Student student = new Student("Maria", "Ivanova");
//		Student student2 = new Student("Nikola", "Tsvetkov");
//		Student student3 = new Student("Yana", "Marinova");
		
		List<Student> students = new ArrayList<>();
		
		
		BufferedReader br = new BufferedReader(new FileReader("studentInfo.txt"));
		
		String line = br.readLine();
		while (line!=null) {
			
			String [] arr = line.split(", ");
			
			students.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));			
			
			line = br.readLine();
		}
//		
		
		
		
//		students.add(student);
//		students.add(student2);
//		students.add(student3);
		
//		//prints all students in the list
//		for (int i = 0; i < students.size(); i++) {
//			System.out.println(students.get(i));
//		}
		
//		//prints all students in the list
//		students.stream().forEach(s->{
//			System.err.println(s.toString());
//		});
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("orderedStudents.txt", true));
		
		
		//prints all students in the list ordered first by first name then by second name
		students.stream().sorted((a,b)->
		{
			
			if (a.getFirstName().compareTo(b.getFirstName())==0) 
			{
				return a.getSecondName().compareTo(b.getSecondName());
			}
			else 
			{
				return a.getFirstName().compareTo(b.getFirstName());
			}
			
		})
		.forEach(s->{
			try {
				bw.write(s.toString() + System.lineSeparator());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		);	
		
		bw.flush();
		bw.close();
		
	}
		
		
		



}
