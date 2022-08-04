package com.accolite.mathematics;

public class AllDivisorsOfANumber {

	public static void main(String[] args) {
		int num=6;
		allDivisorsOfANumber(num);
	}

	private static void allDivisorsOfANumber(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.print(i+" ");
		}
		
	}
}

//theta(n)
//auxilary space: theta(1)