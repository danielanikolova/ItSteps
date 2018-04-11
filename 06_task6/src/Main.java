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
		
		int maxNum =0;
		
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr[col].length; row++) {
				if (arr[row][col]>=maxNum) {
					maxNum = arr[row][col];
				}
			}
			
			System.out.println(maxNum);
			maxNum =0;
		}

	}

}
