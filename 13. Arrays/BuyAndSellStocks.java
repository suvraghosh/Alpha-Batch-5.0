public class BuyAndSellStocks{

    // Time Complexity: O(n)
    public static int buyAndSell(int prices[]){
        int buyStockPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyStockPrice < prices[i]){
                int profit = prices[i] - buyStockPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyStockPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit: " + buyAndSell(prices));
    }
}