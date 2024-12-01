package DYNAMICPROGRAMMING;

public class BuyandSellStock {

    public static int[] buyandSell(int[] prices){
        if (prices == null || prices.length < 2){
            return new int[]{-1, -1};
        }

        int maxPrice = 0;
        int buyDate = -1;
        int sellDate = -1;

        for (int i=0; i<prices.length-1; i++){
            for (int j=i+1; j<prices.length; j++){
                int profit = prices[j] - prices[i];
                if(profit > maxPrice){
                    maxPrice = profit;
                    buyDate = i;
                    sellDate = j;
                }
            }
        }
        return new int[]{buyDate, sellDate};
    }

    public static void main(String[] args){
        int[] prices = {100,180,260,310,40,535,695};
        int[] result = buyandSell(prices);
        System.out.println(prices[result[0]]+ " is the buying price " +result[0]+ " is a buy date "+ prices[result[1]] +" is the selling price "+ result[1] + " is the selling date");
    }
}
