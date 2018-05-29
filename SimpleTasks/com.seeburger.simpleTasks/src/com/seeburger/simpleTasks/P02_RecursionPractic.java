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
		
		printNext(firstNum, lastNum);

	}

	
	private static void printNext(int firstNum, int lastNum) {
			
			if (firstNum != lastNum) {
				System.err.print(firstNum + " ");
				printNext(firstNum * 10, lastNum);
				
			}else {
				System.err.print(firstNum + " ");
				System.err.print(firstNum + " ");
				return;
			}
			
			System.out.println(firstNum + " ");
		
		
	}
		
}
