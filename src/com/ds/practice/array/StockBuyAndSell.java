package com.ds.practice.array;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};

        int i = maximumProfit(arr);

        System.out.println(i);
    }

    public static int maximumProfit(int prices[]) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;

                if (profit < currentProfit) {
                    profit = currentProfit;
                }
            }
        }
        return profit;
    }
}
