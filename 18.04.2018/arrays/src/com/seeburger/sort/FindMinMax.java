package com.seeburger.sort;

/*
 * This class finds minimum and maximum of numbers in array
 */

public final class FindMinMax {
	
	
	// finds minimum element in array
	public static int findMinElement(int [] arr) 
	{
		
		int min = arr[0];
		
		for (int i = 1; i < arr.length ; i++) 
		{
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
	// finds maximum element in array
public static int findMaxElement(int [] arr) 
{
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length ; i++) 
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
		}
		
		return max;
		
	}
	

}
