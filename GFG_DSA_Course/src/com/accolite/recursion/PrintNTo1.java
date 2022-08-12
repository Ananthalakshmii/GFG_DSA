package com.accolite.recursion;

public class PrintNTo1 {
	public static void main(String[] args) {
		int n=5;
		printNTo1(n);
	}

	private static void printNTo1(int n) {
		if(n==0)
			return;
		System.out.println(n);
		printNTo1(n-1);
		
	}

}

//theta(n)
//T(n)=T(n-1)+Theta(1)
//auxiliary space: theta(n)