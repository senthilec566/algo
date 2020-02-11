package com.learning.algo.expert;

public class StockMaxPrice {


  public static void main(String[] args){
      int[] prices = {10, 15, 30, 12, 50, 40, 30};
      maxProfitWithKTransactions(prices);
  }
public static int maxProfitWithKTransactions(int[] prices) {
  // Write your code here.
      int minPrice = prices[0];
      int maxPrice = prices[0];
    int maxProfit = 0;
      for(int i = 1; i < prices.length; i++){
          if(prices[i] < minPrice){
              minPrice = prices[i];
          }
          if(prices[i] > maxPrice){
              maxPrice = prices[i];
          }
          maxProfit = maxPrice - minPrice;
          System.out.println(maxProfit);
      }
  return -1;
}
}
