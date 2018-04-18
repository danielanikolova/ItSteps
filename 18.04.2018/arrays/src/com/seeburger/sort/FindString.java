package com.seeburger.sort;


/*
 * This class finds concrete string in string array
 */

public final class FindString {
	
	public static String findString(String [] arr, String token) {
		
		String result = null;
		int countEqualStrings = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (token.equalsIgnoreCase(arr[i])) 
			{
				result = token;
				countEqualStrings++;
				
			}
		}
		
		if(result == null) 
		{
			return String.format("There is no string like %s.", token);
		}else 
		{
			return String.format("%d string(s) like %s", countEqualStrings, token);
		}
		

		
	}

}
