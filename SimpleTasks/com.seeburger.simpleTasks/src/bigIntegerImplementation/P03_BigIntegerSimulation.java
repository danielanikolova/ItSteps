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
	        String result = null;

	        String firstNum = scanner.nextLine();
	        String secondNum = scanner.nextLine();
	        
	        
	//        result = MyBigInteger.sumBigNumbers(firstNum, secondNum);
	        result = MyBigInteger.subtractBigNumbers(firstNum, secondNum);
	        
	        System.out.println(result);
	        
	}

	

}
