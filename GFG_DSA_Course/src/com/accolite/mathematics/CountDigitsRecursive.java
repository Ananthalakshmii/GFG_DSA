package com.accolite.mathematics;

public class CountDigitsRecursive {
	public static int recursiveCountDigits(int x) {
		if(x==0)
			return 0;
		return 1+recursiveCountDigits(x/10);
		
	}

	public static void main(String[] args) {
		int num=789;
		int count=recursiveCountDigits(num);
		System.out.println(count);
	}
}
