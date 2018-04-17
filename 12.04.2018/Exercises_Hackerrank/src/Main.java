
public class Main {

	public static void main(String[] args) {
		
	int price = 5;
	
	
	int [] prices = {20, 7, 8, 2, 5};
	int housePrice = prices[0];
	int bestSalePrice = 0;
	int bestYear = 0;
	
	for (int i = 1; i < prices.length; i++) {
		if (bestSalePrice<housePrice - prices[i] ) {
			bestSalePrice = housePrice - prices[i];
			bestYear = i;
		}
		
	}
	
	
	System.out.println(bestYear);
	
	}
	
}
