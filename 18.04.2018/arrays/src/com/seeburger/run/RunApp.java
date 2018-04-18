package com.seeburger.run;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import com.seeburger.sort.BubbleSort;
import com.seeburger.sort.FileManipulation;
import com.seeburger.sort.FindMinMax;
import com.seeburger.sort.FindString;
import com.seeburger.sort.SelectionSort;
import com.seeburger.sort.Sortable;

public class RunApp {


	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		// Here we find files in directory
//		FileManipulation.findFiles();
		
		
//		int n = scanner.nextInt();
//		
//		int [] arr = new int [n];
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			arr[i] = random.nextInt(100)+1;
//		}
		
		
		/*
		 * Here we print all files path in concrete directory
		 */
		
		File directory = new File("C:\\Users\\danie\\Desktop\\books");
		
		FileManipulation fm = new FileManipulation();
		fm.findFiles(directory);
		fm.printFilesInDirectory();
		
		
		/*
		 * Here we sort array with different sorting algorithms
		 */
		
		printArr(arr);
		
//		BubbleSort.sort(arr);
//		SelectionSort.sort(arr);
		
		printArr(arr);
		

		/*
		 * Here we find minimum and maximum elements in array
		 */
		
		
//		int min = FindMinMax.findMinElement(arr);
//		
//		int max = FindMinMax.findMaxElement(arr);
//		
//		printArr(arr);
//		
//		
//		System.out.println(min);
//		System.out.println(max);
		
		
		
		/*
		 * Here we find string in string array
		 */
		
//		String [] arrString = new String [5];
//		String searchedString = scanner.nextLine();
//		
//		for (int i = 0; i < arrString.length; i++) 
//		{
//			arrString[i] = scanner.nextLine();
//		}
//		
//		System.out.println(FindString.findString(arrString, searchedString));
		
		

	}
	
	public static void printArr(int [] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

}
