package com.seeburger.sort;

public class SelectionSort implements Sortable{

	
	public static void sort(int[] arr) {
		 
		int minElement;
		int bestIndex = 0;
		boolean minElementIsChanged = false;
		
		 for (int i = 0; i < arr.length; i++) 
		 {		
			 minElement = arr[i];
			 
			 for (int j = i+1; j < arr.length; j++) 
			 {
				if (minElement>arr[j]) 
				{
					minElement = arr[j];
					bestIndex = j;
					minElementIsChanged = true;
				}
			 }
			 
			 if (minElementIsChanged) 
			 {
				Sortable.swap(arr, i, bestIndex);
			 }		 
			 
			
		 }
		
	}
	

}
