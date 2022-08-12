package com.accolite.recursion;

public class _Problem4_DigitalRoot {
	public static void main(String[] args) {
		int n=99999;
		int sum=digitalRoot(n);
		System.out.println(sum);
		System.out.println(digitalRoot(77777));
	}

	private static int digitalRoot(int n) {
		if(n==0)
			return 0;
		int sum= (n%10)+digitalRoot(n/10);
		while(sum>=10) {
			sum= (sum%10)+digitalRoot(sum/10);
		}
		return sum;
	}

}
