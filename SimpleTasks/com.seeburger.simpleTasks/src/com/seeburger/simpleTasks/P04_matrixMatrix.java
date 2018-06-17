/**
 * P04_matrixMatrix.java
 * 
 * created at 2018-05-10 by d.nikolova <d.nikolova@seeburger.com>
 * 
 *  Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

package com.seeburger.simpleTasks;

import java.util.Scanner;

/**
 * 
 * P04_matrixMatrix represents matrix
 *
 */

public class P04_matrixMatrix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int [][] matrix = new int[n][n];
		
		 int value = 1;
         
	        int minCol = 0;
	         
	        int maxCol = n-1;
	         
	        int minRow = 0;
	         
	        int maxRow = n-1;
	         
	        
	        
	        while (value <= n*n)
	        {	//fillDown
	        	 for (int i = minRow; i <= maxRow; i++) 
		            { 
		                matrix[i][minCol] = value; 
		                 
		                value++; 
		            } 
	        	//fillRight
	        	 for (int i = minCol + 1; i <= maxCol; i++) 
		            { 
		                matrix[maxRow][i] = value; 
		                 
		                value++; 
		            } 
	        	//fillUp
	        	 for (int i = maxRow-1; i >= minRow; i--) 
		            { 
		                matrix[i][maxCol] = value; 
		                 
		                value++; 
		            }
	        	 //fillLeft
	        	 for (int i = maxCol-1; i >= minCol + 1; i--) 
		            { 
		                matrix[minRow][i] = value; 
		                 
		                value++; 
		            }
	             
	            minCol++;
	             
	            minRow++;
	             
	            maxCol--;
	             
	            maxRow--;
	        }
	         
	        
	        // here we print the matrix
	        for (int i = 0; i < matrix.length; i++)
	        {
	            for (int j = 0; j < matrix.length; j++)
	            {
	                System.out.print(matrix[i][j]+ "\t");
	            }
	             
	            System.out.println();
	        }
	    

	}

}
