/**
 * P03_BigIntegerSimulation.java
 * 
 * created at 2018-05-10 by d.nikolova <d.nikolova@seeburger.com>
 * 
 *  Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

package bigIntegerImplementation;

import java.math.BigInteger;
import java.util.Scanner;

/*
 *  P03_BigIntegerSimulation implements the basic methods of BigInteger class.
 */

public class P03_BigIntegerSimulation {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder();

	        String firstNum = scanner.nextLine();
	        String secondNum = scanner.nextLine();
	        
	        String resultSum = BigIntegerImplementation.sumBigNumbers(firstNum, secondNum);
	        String result2 = BigIntegerImplementation.subtractNumbers(firstNum, secondNum);
	        
//	        System.out.println(resultSum);
	        System.out.println(result2);
	        
//	      BigInteger result = new BigInteger("-2");
//	      
//	      BigInteger r = result.subtract(BigInteger.valueOf(2));
//	      
//	      System.out.println(r);
	        
	}

	

}
