package collections.funny.task;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Hello, your file contains information about company employees. %n"
				+ "What information you want to get for your specific needs.%n "
				+ "Please select a type of collection according to your needs.%n ");
		
		System.out.printf("Please enter: %n"
				+ "\"Print all\" for printing all employyes names.%n" //Array list
				+ "\"Print all by order of input\" for printing all employyes names by order of input.%n" //Linked list
				+ "\"Print unique\" prints all unique names.%n"// Hash set
				+ "\"Print unique\" prints all unique names by order of input.%n"// Linked Hash Set
				+ "\"Print employees by department\" - prints all names by department and by order of input of department.%n"// Hash Map
				+ "\"Print employees by department\" - prints all names by department and by order of input of department.%n" //Linked Hash Map
				+ "\"Print employees ordered by department\" - prints all names by department. Department names are ordered in ascending order%n");// Tree Map

	}

}
