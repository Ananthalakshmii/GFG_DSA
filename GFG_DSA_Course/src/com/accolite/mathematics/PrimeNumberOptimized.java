package com.accolite.mathematics;

public class PrimeNumberOptimized {
	public static void main(String[] args) {
		int num=13;
		boolean result=isPrimeOptimized(num);
		System.out.println(result);
		System.out.println(isPrimeOptimized(121)); //prime
		System.out.println(isPrimeOptimized(1031)); //prime
	}

	private static boolean isPrimeOptimized(int num) {
		if(num==1)
			return false;
		if(num==2 ||num==3)
			return true;
		if(num%2==0 || num%3==0) //all even numbers are skipped for %2
			return false;
		for(int i=5;i*i<num;i+=6) // check initialization, break condition and increment condition
			if(num%i==0 || num%(i+2)==0) // doing 2 divisibility checks
				return false;
		return true;
	}
}

//n=1031 -> i=5,11,17,23,29 -> only 5 iterations
//3 times faster than efficient method with complexity O(sqrt(n))