package com.accolite.mathematics;

public class CountDigitsIterative {
	
	public static int countDigits(int x) {
		int count=0;
		while(x!=0) {
			x=x/10;
			++count;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int num=789;
		int count=countDigits(num);
		System.out.println(count);
		
	}

}

//theta(d) ->d=num of digits