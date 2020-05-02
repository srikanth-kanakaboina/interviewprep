package leetcode;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("Max Profit : " +maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        for (int i = 1; i <prices.length; i++) {
            System.out.println("int["+(i-1)+"] "+prices[i-1]+" int["+i+"] "+prices[i]+" maxProfit "+maxProfit);

            if(prices[i-1]<prices[i]){
                maxProfit+=prices[i]-prices[i-1];
            }

        }
    return maxProfit;
    }
}
