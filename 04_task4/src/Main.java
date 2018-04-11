import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] firstArr = new int[n];
		int [] secondArr = new int[n];
		int [] thirdArr = new int[n];
		
		
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < secondArr.length; i++) {
			secondArr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < thirdArr.length; i++) {
			if (firstArr[i]>=secondArr[i]) {
				thirdArr[i] = firstArr[i]; 
				
			}else {
				thirdArr[i] = secondArr[i];
			}
			
			System.out.printf(thirdArr[i] + " ");
		}
		

	}

}
