package com.accolite.arrays;

//you know the value of stocks for upcoming days
public class StockBuyAndSellNaive {
	public static void main(String[] args) {
		int[] arr= {1,5,3,8,12};
		int profit=maxProfit(arr,0,arr.length-1);
		System.out.println(profit);
	}

	private static int maxProfit(int[] arr, int low, int high) {
		if(high<=low)
			return 0;
		int profit=0;
		for(int i=low;i<=high;i++) {
			for(int j=i+1;j<=high;j++) {
				if(arr[j]>arr[i]) {
				int current_profit=(arr[j]-arr[i])+
						maxProfit(arr, low,i-1)+
						maxProfit(arr, j+1, high);
				profit=Math.max(profit, current_profit);
				}
			}
		}
		return profit;
	}

}
