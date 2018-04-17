import java.util.Random;

public class RunToto {

	public static void main(String[] args) {
	int [] myNums = {2,5,19,3,26,42};
	
	Random random = new Random(System.currentTimeMillis());
		
		int [] winningNums = findWinningNums(random);
		
//		printNums(myNums);
//		printNums(winningNums);
		
//		//checks if wins
//		String result = checkIfWin(myNums, winningNums);
//		
//		
//		System.out.println(result);
		
		int countChance = 0;
		
		
		
		String result = checkIfWin(myNums, winningNums);
		
		while (result.equalsIgnoreCase("Try again!")) {
			
			winningNums = findWinningNums(random);
			result = checkIfWin(myNums, winningNums);
			countChance++;
		}
		
		System.out.println(result);
		printNums(myNums);
		printNums(winningNums);
		System.out.println(countChance);

	}

	private static void printNums(int[] myNums) {
		for (int i = 0; i < myNums.length; i++) {
			System.out.print(myNums[i] + " ");
		}
		
		System.out.println();
		
	}

	// This method checks if the chosen numbers win
	private static String checkIfWin(int[] myNums, int[] winningNums) 
	{
	
		String result = null;
		int countWinnigNums = 0;
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < winningNums.length; i++) 
		{
			for (int j = 0; j < myNums.length; j++) 
			{
				if (myNums[j] == winningNums[i]) 
				{
					countWinnigNums++;
					
					sb.append(myNums[j]).append(" ");
					
				}
			}
		}
		
		String resultToPrint = null;
		
		if (countWinnigNums>=3) 
		{
			resultToPrint = "You won: " + sb.toString();
		}else 
		{
			resultToPrint = "Try again!";
		}
		
		
		return resultToPrint;
	}

	private static int[] findWinningNums(Random random) 
	{
		int [] winningNums = new int[6];
		
		
		
		
		int currentNum = 0;
		
		for (int i = 0; i < winningNums.length; i++) 
		{
			
			currentNum = random.nextInt(45) + 1;
			
			
			// Checks if we already have this number
			for (int j = 0; j < winningNums.length; j++)
			{
				if(winningNums[j] == 0) {
					break;
				}else if (currentNum == winningNums[j]) {
					currentNum = random.nextInt(45) + 1;
					j = 0;
					
				}
							
			
			}
			
				winningNums[i] = currentNum;
			
		}
		
		return winningNums;

	}

}
