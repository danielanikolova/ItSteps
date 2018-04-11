import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> nums = new ArrayList<>();
		List<Integer>numsPow = new ArrayList<>();
		
		int currentNum = 0;		
		
		for (int i = 0; i < n; i++) {
			currentNum = Integer.parseInt(br.readLine());
			nums.add(currentNum);
			numsPow.add(currentNum*currentNum);
		}
		
		int currentPowSum =0;
		
		for (int i = 0; i < nums.size()-1; i++) {
			
			int first = nums.get(i);
			
			for (int j = i+1; j < nums.size(); j++) {				
				
				int second = nums.get(j);
				
				currentPowSum = first*first + second*second;
				
				if (numsPow.contains(currentPowSum)) {
					
					int indexOf = numsPow.indexOf(currentPowSum);
					
					int third = nums.get(indexOf);
					
					System.out.printf("%d*%d + %d*%d = %d*%d\n", first, first, second, second, third, third);
				}
				
			}
			
			
		}
		
	}

}
