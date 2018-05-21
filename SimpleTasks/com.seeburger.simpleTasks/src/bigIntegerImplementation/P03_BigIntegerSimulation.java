/**
 * P03_BigIntegerSimulation.java
 * 
 * created at 2018-05-10 by d.nikolova <d.nikolova@seeburger.com>
 * 
 *  Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

package bigIntegerImplementation;

import java.util.Scanner;

/*
 *  P03_BigIntegerSimulation implements the basic methods of BigInteger class.
 */

public class P03_BigIntegerSimulation {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
	        String result = null;

	        String firstNum = scanner.nextLine();
	        String secondNum = scanner.nextLine();
	        
	        MyBigInteger myFirstInteger = new MyBigInteger(firstNum);
	        MyBigInteger mySecondInteger = new MyBigInteger(secondNum); 
	        
	        
//	        result = myFirstInteger.sumBigNumbers(mySecondInteger);
	        result = myFirstInteger.subtractBigNumbers(mySecondInteger);
	        
	        System.out.println(result);
	        
	}

	

}
