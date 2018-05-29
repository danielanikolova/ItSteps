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
		
//		Scanner scanner = new Scanner(System.in);
//
//	        String firstNum = scanner.nextLine();
//	        String secondNum = scanner.nextLine();
//	 
////	        MyBigInteger myFirstInteger = new MyBigInteger(firstNum);
////	        MyBigInteger mySecondInteger = new MyBigInteger(secondNum);         	        
////	        MyBigInteger result = new MyBigInteger(myFirstInteger.sumBigNumbers(mySecondInteger));
//////	        MyBigInteger result = new MyBigInteger(myFirstInteger.subtractBigNumbers(mySecondInteger));
//	        
//	        BigInt myFirstInteger = new BigInt(firstNum);
//	        BigInt mySecondInteger = new BigInt(secondNum);
//	        
//	        BigInt resultSum = myFirstInteger.add(mySecondInteger);
////	        BigInt resultSubtract = myFirstInteger.subtract(mySecondInteger);
//	        
//	        System.out.println(resultSum.toString());
////	        System.out.println(resultSubtract.toString());
	    
	        String[] testsFirst = {"20", "20", "-10", "-20", "20", "10", "20", "-9", "-9", "-19"};
	        String[] testsSecond = {"-40", "10", "120", "9", "-9", "-19", "-11", "-9", "-20", "-1"};
	 
	       
	        for (int i = 0; i < testsSecond.length; i++) {
	            String input = testsFirst[i];
	            
	            String secondInput = testsSecond[i];
	            BigInt b1 = new BigInt(testsFirst[i]);
	            BigInt b2 = new BigInt(testsSecond[i]);
	           
	     
	            String debug = "";
	            System.out.print(debug);
	                       
	            BigInt sumResult = b1.add(b2);
	            System.out.println(input + " + (" + secondInput + ") = " + sumResult.toString());
	            System.out.println(input + " - (" + secondInput + ") = " + b1.subtract(b2));
	 
	        }
	       
	        
	}

}
