import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		int[] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		boolean canDevide = false;
		
		
		for (int i = 2; i < arr[0]; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]%i==0) {
					canDevide = true;
					
				}else {
					canDevide = false;
					break;
				}				
				
			}
			
			if (canDevide==true) {
				System.out.println(i);
			}
		}
	}

}
