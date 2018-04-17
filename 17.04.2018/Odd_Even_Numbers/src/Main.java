import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int [] arr = new int [100];
		
		Random random = new Random();
		
		int currentNum = 0;
		int evenCount = 0;
		int oddCount = 0;
		
		//fills array with random numbers
		for (int i = 0; i < arr.length; i++) {
			
			currentNum = random.nextInt( 99) +1;
			if (currentNum%2 == 0) {
				evenCount++;
				arr[i] = currentNum;
			}else {
				oddCount++;
				arr[i] = currentNum;
			}
		}
		
		int [] evenArr = new int [evenCount];
		int [] oddArr = new int [oddCount];
		
		
		int currentIndex =0;
		
		//fills array with even numbers
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				evenArr[currentIndex] = arr[i];
				currentIndex++;
				if (currentIndex == evenArr.length  ) {
					currentIndex = 0;
					break;
				}
			}
		}
		
		//fills array with even numbers
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) {
				oddArr[currentIndex] = arr[i];
				currentIndex++;
				if (currentIndex == oddArr.length ) {
					break;
				}
			}
		}
		
		//prints odd numbers
		
		System.out.println("Odd numbers are:");
		for (int i = 0; i < oddArr.length; i++) {
			System.out.print(oddArr[i] + " ");
		}
		
		System.out.println();
		
		//prints even numbers
		
		System.out.println("Even numbers are:");
		for (int i = 0; i < evenArr.length; i++) {
			System.out.print(evenArr[i] + " ");
		}

	}

}
