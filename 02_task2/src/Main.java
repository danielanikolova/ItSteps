import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int[n];
		
		int currentnum;
		
		for (int i = 0; i < arr.length; i++) {
			currentnum = Integer.parseInt(br.readLine());
	
			arr[i] = currentnum;
			
			
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.printf("%d ",arr[i]);
		}
		

	}

}
