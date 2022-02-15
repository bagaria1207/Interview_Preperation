package important_questions;

public class Buy_Sell_Stock {

	public static int stock(int[] prices) {
		int min_Price = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < min_Price) {
				min_Price = prices[i];
			} else if(prices[i] - min_Price > maxProfit) {
				maxProfit = prices[i] - min_Price;
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		
		System.out.println(stock(new int[] {7,1,2,3,4,5,6,8}));
		
	}

}
