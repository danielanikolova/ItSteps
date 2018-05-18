/**
 * P01_tigitRepresentation.java
 * 
 * created at 2018-05-10 by d.nikolova <d.nikolova@seeburger.com>
 * 
 *  Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

package com.seeburger.simpleTasks;

/*
 * P02_RecursionPractic represents 10 100 1000 10000 10000 1000 100 10 the series of numbers recursively
 */
public class P02_RecursionPractic {

	public static void main(String[] args) {
		
		int firstNum = 10;
		int lastNum = 10000;
		
		printNextIncreasing(firstNum, lastNum);
		printNextDecreasing(lastNum, firstNum);

	}

	
	private static void printNextDecreasing(int firstNum, int lastNum) {
		
		if (firstNum == lastNum) 
		{
			System.out.print(firstNum + " ");	
			return;
		}
		
		System.out.print(firstNum + " ");
		printNextDecreasing(firstNum / 10, lastNum);
		
	}

	private static void printNextIncreasing(int lastNum, int firstNum) 
	{
		
		if (lastNum ==  firstNum) 
		{
			System.out.print(firstNum + " ");	
			return;
		}
		
		System.out.print(lastNum + " ");
		printNextIncreasing(lastNum * 10, firstNum);
		
	}

}
