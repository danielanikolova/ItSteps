package bigIntegerImplementation;

public class BigIntegerImplementation {

	
	public static String subtractNumbers(String firstNum, String secondNum) {
		
		StringBuilder sb = new StringBuilder();
        int result = 0;
        int toRemember = 0;
        
        boolean isNegative = false;
        
        int n = 0;
        
        
//        if (firstNum.startsWith("-")) {
//			if (secondNum.startsWith("-")) {
//				firstNum = firstNum.substring(1, firstNum.length());
//				int theBiggerNum = findTheBigNum(firstNum, secondNum);
//			}else {
//				return "-" + sumBigNumbers(firstNum, secondNum);
//			}
//		}
        
        // Here we find witch one is the bigger number. So we can ensure that we will subtract the result from the big one.
        if (firstNum.length()>secondNum.length()){
            n = firstNum.length();

        }else if (firstNum.length()<secondNum.length()){
            n = secondNum.length();
            isNegative = true;
            String temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;
         }else {
        	 int theBiggerNum = findTheBigNum(firstNum, secondNum);
        	 
        	 if (theBiggerNum == 0) {
				return "0";
			}else if(theBiggerNum == 2) {
				 String temp = firstNum;
				 isNegative = true;
		         firstNum = secondNum;
		         secondNum = temp;
			}
         }

        int first;
        int second;
        
        
        //Here we subtract the numbers` digits. 
        for (int i = 0; i < n; i++) {
			
        		if (i >= secondNum.length()){
	               first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1-i)));
	               sb.append(String.valueOf(first - toRemember));
	               toRemember = 0;
	               continue;
	              
	           }else {
	               second = Integer.parseInt(String.valueOf(secondNum.charAt(secondNum.length()-1-i)));
	               first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1-i)));
	           }
        	 
        	 
        	//Here we subtract the digits
        	 
        	 if (first - toRemember - second>= 0) {
				result = first - toRemember - second;
			}else {
				toRemember++;
				result = first + 10 - second;
			}

        	 sb.append(String.valueOf(result));
        	
		}
        
        sb.reverse();
        
        // Here we remove the zeroes from the beginning in the result 
        while (sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        } 
        

        if (isNegative) {
			return "-"+ sb.toString();
		}else return sb.toString();
		
		
	}
	
	private static int findTheBigNum(String firstNum, String secondNum) {
		
		
		for (int i = 0; i < firstNum.length(); i++) {
			if (firstNum.charAt(i)>secondNum.charAt(i)) {
				return  1;
			}else if(firstNum.charAt(i)<secondNum.charAt(i)) {
				return 2;
			}
		}
		
		
		return 0;
	}

	public static String sumBigNumbers(String firstNum, String secondNum) 
	{		
			StringBuilder sb = new StringBuilder();
			int numToAdd = 0;
	        int sum;

	        int n;
	        if (firstNum.length()>=secondNum.length()){
	            n = firstNum.length();


	        }else{
	            n = secondNum.length();
	          }

	        int first;
	        int second;

	        for (int i = 0; i < n; i++) 
	        {

	           if (i >= firstNum.length())
	           {
	               first =0;
	               second = Integer.parseInt(String.valueOf(secondNum.charAt(secondNum.length()-1-i)));
	           }else if (i >= secondNum.length()){
	               first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1-i)));
	               second = 0;
	           }else {
	               second = Integer.parseInt(String.valueOf(secondNum.charAt(secondNum.length()-1-i)));
	               first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1-i)));
	           }

	           if ((first+second +numToAdd) >=10)
	           {
	               sum = (first+second+numToAdd)%10;
	               numToAdd = ((first+second+numToAdd)/10)%10;
	           }else {
	               sum = first+second+numToAdd;
	               numToAdd=0;
	           }

	           sb.append(String.valueOf(sum));

	        }
	        
	        if (numToAdd!=0){
	            sb.append(String.valueOf(numToAdd));

	        }

	        StringBuilder result = sb.reverse();

	        while (sb.charAt(0)=='0'){
	            sb.deleteCharAt(0);
	        }    

		return result.toString();
	}

}
