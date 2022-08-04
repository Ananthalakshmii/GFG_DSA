package com.accolite.mathematics;

public class SieveOfEratosthenes_PrimeNumbers {

	public static void main(String[] args) {
		int num=23;
		printPrimes(num);
	}

	private static void printPrimes(int num) {
		
		for(int i=2;i<=num;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		
	}

	private static boolean isPrime(int i) {
		if(i==1)
			return false;
		if(i==2 || i==3)
			return true;
		if(i%2==0 || i%3==0)
			return false;
		for(int j=5;j*j<=i;j=j+6) {
			if(i%j==0 || i%(j+2)==0)
				return false;
		}
		return true;
	}

}


//O(n*sqrt(n))