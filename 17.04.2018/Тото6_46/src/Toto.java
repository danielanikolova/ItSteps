import java.util.Random;

public class Toto {

	public static void main(String[] args) {

		
		int [] myNums = {2,5,19,3,26,42};
		
		int [] winningNums = findWinningNums();
		
		//checks if wins
		String result = checkIfWin(myNums, winningNums);
		
		System.out.println(result);
		

	}

	private static String checkIfWin(int[] myNums, int[] winningNums) 
	{
	
		String result = null;
		int countWinnigNums =0;
		
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
			resultToPrint = "You won" + sb.toString();
		}else 
		{
			resultToPrint = "Try again!";
		}
		
		
		return resultToPrint;
	}

	private static int[] findWinningNums() 
	{
		int [] winningNums = new int[6];
		
		
		Random random = new Random();
		
		int currentNum = 0;
		boolean containNum = false;
		
		for (int i = 0; i < winningNums.length; i++) 
		{
			
			currentNum = random.nextInt(45) + 1;
			
			for (int j = 0; j < winningNums.length; j++)
			{
				
				
				if (currentNum == winningNums[j]) 
				{
					containNum = true;
					break;
				}				
			
			}
			
			if (containNum = false) 
			{
				winningNums[i] = currentNum;
			}
			
		}
		
		return winningNums;
	}

}
