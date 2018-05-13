
/**
 * P01_tigitRepresentation.java
 * 
 * created at 2018-05-10 by d.nikolova <d.nikolova@seeburger.com>
 * 
 *  Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

package com.seeburger.simpleTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * P01_tigitRepresentation represents all digits in a number without using 
 * String representation of the number
 *
 */

public class P01_tigitRepresentation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int currentDigit;
		
		Deque<Integer> digits = new ArrayDeque<>();
		
		while (true) {
			
			currentDigit = num % 10;
			
			digits.push(currentDigit);
			
			num = num/10;
			
			if (num/10==0) {
				digits.push(num);
				break;
			}
			
		}
		
		while (!digits.isEmpty()) {
			System.out.print(digits.pop() + " ");
		}
		
		
		
		

	}

}
