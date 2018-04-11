import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long n = Long.parseLong(br.readLine());
		
		List<Long> nums = new ArrayList<>();
		
		if (n==0) {
			System.out.println("Is Fibonaci number");
		}else if (n==1) {
			System.out.println("Is Fibonaci number");
		}else {
			for (long i = n; i >= 2; i++) {
				if (n-1 == n-2) {
					System.out.printf("%d is Fibonaci number", i);
					nums.add(i);
				}else {
					System.out.printf("%d is not Fibonaci number", i);
				}
			}
		}

	}

}
