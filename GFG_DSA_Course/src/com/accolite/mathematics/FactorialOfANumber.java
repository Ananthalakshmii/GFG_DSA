package com.accolite.mathematics;

public class FactorialOfANumber {
	
	public static void main(String[] args) {
		int num=4;
		int result=factorial(num);
		System.out.println(result);
	}

	private static int factorial(int num) {
		if(num==0)
			return 1;
		int factorial=1;
		while(num>0) {
			factorial=factorial*num;
			num=num-1;
		}
		return factorial;
	}

}

//theta(n)
//auxilary space= theta(1)