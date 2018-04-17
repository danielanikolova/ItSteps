package p_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.CORBA.PUBLIC_MEMBER;

public class IntConverter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(br.readLine());
		
		String result = null;
		
		result = findBitwiseNumber(inputNum);	
		System.out.println(result);
		

	}
	// convert decimal to binary
	public static String findBitwiseNumber(int inputNum) {
		
		StringBuilder sb = new StringBuilder();
	
		while (inputNum !=0) {
			if (inputNum%2 == 0) {
				inputNum/=2;
				sb.append(0);
			}else {
				sb.append(1);
				inputNum /=2;
			}
		}
		
		return sb.reverse().toString();
		
	}

}
