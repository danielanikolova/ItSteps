import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] arr = new int [n][n];
		int sum1 = 0;
		int sum2 = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(br.readLine());
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum1+= arr[i][i];
			sum2+= arr[i][n-1-i];
		}
		
		
		
		
		if (sum1>=sum2) {
			System.out.println(sum1);
		}else {
			System.out.println(sum2);
		}

	}

}
