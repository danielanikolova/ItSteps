import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		nums = sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

	private static int[] sort(int[] nums) {
		
	
		int smallerNumber;

		for (int i = 0; i < nums.length - 1; i++) {
        
            int indexToSwap = i;
            for (int j = i + 1; j < nums.length; j++)
            	
                if (nums[j] < nums[indexToSwap]) 
                    indexToSwap = j;
      
            smallerNumber = nums[indexToSwap];  
            nums[indexToSwap] = nums[i];
            nums[i] = smallerNumber;
        }
  		
		return nums;
	}

}
