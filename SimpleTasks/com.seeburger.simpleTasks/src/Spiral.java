import java.io.IOException;


public class Spiral { 
  private int[][] spiral;
  private int atRow, atCol;
  private int value;
  private int[] left = {0, 1};
  private int[] right = {0, -1};
  private int[] down = {1, 0};
  private int[] up = {-1, 0};
  int n;

  public static void main(String[] args) throws NumberFormatException, IOException {

		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  	
	  	int matrixSize = 5;
		int startRow = 0;
	  	int startCol = 0;
		Spiral spiralMatrix = new Spiral(matrixSize, startRow,startCol);
		
		spiralMatrix.fill();

		System.out.println("This is a spiral matrix with coordinates:("+startRow+","+startCol+")");
		
		spiralMatrix.print();
	  }
  
  public Spiral(int n, int atRow, int atCol) {
	this.atRow = atRow;
	this.atCol = atCol;
	this.n = n;
	this.spiral = new int[n][n];
	this.value = 1;
  }

  private void move(int[] direction) {
	atRow += direction[0];
	atCol += direction[1];
	spiral[atRow][atCol] = value++;
  }

  public void print() {
	for (int i = 0; i < spiral.length; i++)
	{
  	for (int j = 0; j < spiral.length; j++)
  	{
    	System.out.print(spiral[i][j]+ "\t");
  	}

  	System.out.println();
	}
  }

  private void fill() {
	int value = 1;

	int minCol = 0;

	int maxCol = n-1;

	int minRow = 0;

	int maxRow = n-1;

	for (int i = 0; i < n/2 + n%2; ++i) {
  	while (atCol < maxCol) move(left);
  	while (atRow < maxRow) move(down);
  	while (atCol > minCol) move(right);
  	while (atRow > minRow+1) move(up);
  	
  	minCol++;
  	minRow++;
  	maxCol--;
  	maxRow--;
	}
  }
}


