package com.accolite.arrays;

public class _Problem33_BettingGame {
	public static void main(String[] args) {
		String result="WL";
		int res=betBalance(result);
		System.out.println(res);
		System.out.println(betBalance("WLWLLLWWLW"));
		
	}

	private static int betBalance(String result) {
		int len=result.length();
		int sum=4;
		int bet=1;
		for(int i=0;i<len;i++) {
			if(result.charAt(i)=='W' && sum>=bet) {
				sum=sum+bet;
				bet=1;
			}else if(result.charAt(i)=='L' && sum>=bet){
				sum=sum-bet;
				bet=2*bet;
			}else
				return -1;
				
		
		}
		
		return sum;
	}

}
