package com.accolite.arrays;

public class StockBuyAndSellEfficient {

	public static void main(String[] args) {
		int[] arr= {1,5,3,8,12};
		int profit=maxProfit(arr);
		System.out.println(profit);
	}

	private static int maxProfit(int[] arr) {
		int profit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1])
				profit=profit+(arr[i]-arr[i-1]);
		}
		return profit;
	}
}

//o(n)